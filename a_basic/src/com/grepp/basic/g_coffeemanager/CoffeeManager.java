package com.grepp.basic.g_coffeemanager;

import com.grepp.basic.g_coffeemanager.Coffee;
import java.util.Scanner;

public class CoffeeManager {

    public static void main(String[] args) {
        app();
    }

    private static void app() {
        Scanner sc = new Scanner(System.in);

        Coffee americano = new Coffee("americano", 1000, 500, 10, 3, 0);
        Coffee mocha = new Coffee("mocha", 2000, 1000, 10, 3, 0);
        Coffee latte = new Coffee("latte", 3000, 1500, 10, 3, 0);
        Coffee jetti = new Coffee("jetti", 4000, 2000, 10, 3, 0);

        Coffee[] coffees = {americano, mocha, latte, jetti};

        int balance = 100000;   // 잔고
        int expensesAmount = 0; // 매출
        int salesAmount = 0;    // 지출

        while (true) {
            System.out.println("\n=== menu ===\n");
            System.out.println("판매등록(1)");
            System.out.println("현황(2)");
            System.out.println("종료(3)");
            System.out.print("입력: ");
            int menu = sc.nextInt();

            if (menu == 3) {
                System.out.println(" system: 종료합니다.");
                break;
            }

            if (menu < 1 || menu > 3) {
                System.out.println(" system: 잘 못 입력하였습니다.");
                break;
            }

            if (menu == 1) {
                System.out.println("\n=== list ===\n");
                for (int i = 0; i < coffees.length; i++) {
                    System.out.println(coffees[i].name + "(" + i + ")");
                }

                System.out.print("상품코드: ");
                int code = sc.nextInt();
                System.out.print("판매량: ");
                int orderCnt = sc.nextInt();

                if (code < 0 || code >= coffees.length) {
                    System.out.println("잘못된 음료 코드입니다.");
                    continue;
                }

                Coffee coffee = coffees[code];

                if (orderCnt <= coffee.stock) {
                    // 판매
                    // 재고 반영
                    coffee.stock -= orderCnt;
                    // 판매량 반영
                    coffee.salesCnt += orderCnt;
                    // 잔고 반영
                    balance += coffee.price * orderCnt;
                    // 매출 반영
                    salesAmount += coffee.price * orderCnt;
                } else {
                    // 매입
                    // 매입금액 산정
                    int purchasePrice = coffee.cost * orderCnt;

                    if (purchasePrice > balance) {
                        System.out.println(" system: 주문을 취소합니다.");
                        continue;
                    }

                    // 매입 + 판매
                    System.out.println(
                        "system: " + coffee.name + " 재고 " + orderCnt + "개 확보합니다.");
                    // 매입
                    // 재고 반영
                    coffee.stock += orderCnt;
                    // 잔고 반영
                    balance -= purchasePrice;
                    // 지출 반영
                    expensesAmount += purchasePrice;

                    // 판매
                    coffee.stock -= orderCnt;
                    // 판매량 반영
                    coffee.salesCnt += orderCnt;
                    // 잔고 반영
                    balance += coffee.price * orderCnt;
                    // 매출 반영
                    salesAmount += coffee.price * orderCnt;
                }

                // 안전재고 기준선 확인
                if (coffee.stock <= coffee.safetyStock) {
                    // 매입금액 산정
                    int purchasePrice = coffee.safetyStock * 2 * coffee.cost;
                    if (balance >= purchasePrice) {
                        // 매입
                        // 재고 반영
                        coffee.stock += coffee.safetyStock * 2;
                        // 잔고 반영
                        balance -= purchasePrice;
                        // 지출 반영
                        expensesAmount += purchasePrice;
                    } else {
                        // 매입 실패
                        System.out.println(" system: 잔액부족으로 안전재고 확보 실패");
                    }
                }

                System.out.println("\n 제품명 : " + coffee.name
                    + " \n 판매가 : " + coffee.price
                    + " \n 판매수량 : " + orderCnt
                    + " \n 결재금액 : " + coffee.price * orderCnt
                    + " \n 남은 재고 : " + coffee.stock
                );


            } else {
                for(Coffee coffee : coffees){
                    System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", coffee.name, coffee.stock, coffee.salesCnt);
                }
                System.out.printf("잔고 : %4d | 매출 : %8d | 지출 : %8d \n", balance, salesAmount, expensesAmount);
            }
        }
    }
}
