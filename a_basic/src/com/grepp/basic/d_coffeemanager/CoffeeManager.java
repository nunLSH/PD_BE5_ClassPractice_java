package com.grepp.basic.d_coffeemanager;

import java.util.Scanner;

public class CoffeeManager {

    public static void main(String[] args) {
        app();
    }

    private static void app() {
        Scanner sc = new Scanner(System.in);

        String americanoName = "americano";
        int americanoPrice = 1000;
        int americanoCost = 500;
        int americanoStock = 10;
        int americanoSafetyStock = 3;
        int americanoSalesCnt = 0;

        String mochaName = "mocha";
        int mochaPrice = 2000;
        int mochaCost = 1000;
        int mochaStock = 10;
        int mochaSafetyStock = 3;
        int mochaSalesCnt = 0;

        String latteName = "latte";
        int lattePrice = 3000;
        int latteCost = 1500;
        int latteStock = 10;
        int latteSafetyStock = 3;
        int latteSalesCnt = 0;

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

            if (menu < 1 || menu > 3){
                System.out.println(" system: 잘 못 입력하였습니다.");
                break;
            }

            if (menu == 1) {
                System.out.println("\n=== list ===\n");
                System.out.println(americanoName + "(0)");
                System.out.println(mochaName + "(1)");
                System.out.println(latteName + "(2)");

                System.out.print("판매상품코드: ");
                int code = sc.nextInt();
                System.out.print("판매량: ");
                int orderCnt = sc.nextInt();

                if (code < 0 || code > 2){
                    System.out.println("잘못된 음료 코드입니다.");
                    break;
                }

                if (code == 0) {
                    if (orderCnt <= americanoStock) {
                        // 판매
                        // 재고 반영
                        americanoStock -= orderCnt;
                        // 판매량 반영
                        americanoSalesCnt += orderCnt;
                        // 잔고 반영
                        balance += americanoPrice * orderCnt;
                        // 매출 반영
                        salesAmount += americanoPrice * orderCnt;
                    } else {
                        // 매입
                        // 매입금액 산정
                        int purchasePrice = americanoCost * orderCnt;

                        if (purchasePrice > balance) {
                            System.out.println(" system: 주문을 취소합니다.");
                            continue;
                        }

                        // 매입 + 판매
                        System.out.println("system: " + americanoName + " 재고 " + orderCnt + "개 확보합니다.");
                        // 매입
                        // 재고 반영
                        americanoStock += orderCnt;
                        // 잔고 반영
                        balance -= purchasePrice;
                        // 지출 반영
                        expensesAmount += purchasePrice;

                        // 판매
                        americanoStock -= orderCnt;
                        // 판매량 반영
                        americanoSalesCnt += orderCnt;
                        // 잔고 반영
                        balance += americanoPrice * orderCnt;
                        // 매출 반영
                        salesAmount += americanoPrice * orderCnt;
                    }

                    // 안전재고 기준선 확인
                    if (americanoStock <= americanoSafetyStock) {
                        // 매입금액 산정
                        int purchasePrice = americanoSafetyStock * 2 * americanoCost;
                        if (balance >= purchasePrice) {
                            // 매입
                            // 재고 반영
                            americanoStock += americanoSafetyStock * 2;
                            // 잔고 반영
                            balance -= purchasePrice;
                            // 지출 반영
                            expensesAmount += purchasePrice;
                        } else {
                            // 매입 실패
                            System.out.println(" system: 잔액부족으로 안전재고 확보 실패");
                        }
                    }

                    System.out.println("\n 제품명 : " + americanoName
                        + " \n 판매가 : " + americanoPrice
                        + " \n 판매수량 : " + orderCnt
                        + " \n 결재금액 : " + americanoPrice * orderCnt
                        + " \n 남은 재고 : " + americanoStock
                        + " \n 잔고 : " + balance
                        + " \n 매출 : " + salesAmount
                        + " \n 지출 : " + expensesAmount
                    );

                } else if (code == 1) {
                    if (orderCnt <= mochaStock) {
                        // 판매
                        // 재고 반영
                        mochaStock -= orderCnt;
                        // 판매량 반영
                        mochaSalesCnt += orderCnt;
                        // 잔고 반영
                        balance += mochaPrice * orderCnt;
                        // 매출 반영
                        salesAmount += mochaPrice * orderCnt;
                    } else {
                        // 매입
                        // 매입금액 산정
                        int purchasePrice = mochaCost * orderCnt;

                        if (purchasePrice > balance) {
                            System.out.println(" system: 주문을 취소합니다.");
                            continue;
                        }

                        // 매입 + 판매
                        System.out.println("system: " + mochaName + " 재고 " + orderCnt + "개 확보합니다.");
                        // 매입
                        // 재고 반영
                        mochaStock += orderCnt;
                        // 잔고 반영
                        balance -= purchasePrice;
                        // 지출 반영
                        expensesAmount += purchasePrice;

                        // 판매
                        mochaStock -= orderCnt;
                        // 판매량 반영
                        mochaSalesCnt += orderCnt;
                        // 잔고 반영
                        balance += mochaPrice * orderCnt;
                        // 매출 반영
                        salesAmount += mochaPrice * orderCnt;
                    }

                    // 안전재고 기준선 확인
                    if (mochaStock <= mochaSafetyStock) {
                        // 매입금액 산정
                        int purchasePrice = mochaSafetyStock * 2 * mochaCost;
                        if (balance >= purchasePrice) {
                            // 매입
                            // 재고 반영
                            mochaStock += mochaSafetyStock * 2;
                            // 잔고 반영
                            balance -= purchasePrice;
                            // 지출 반영
                            expensesAmount += purchasePrice;
                        } else {
                            // 매입 실패
                            System.out.println(" system: 잔액부족으로 안전재고 확보 실패");
                        }
                    }

                    System.out.println("\n 제품명 : " + mochaName
                        + " \n 판매가 : " + mochaPrice
                        + " \n 판매수량 : " + orderCnt
                        + " \n 결재금액 : " + mochaPrice * orderCnt
                        + " \n 남은 재고 : " + mochaStock
                        + " \n 잔고 : " + balance
                        + " \n 매출 : " + salesAmount
                        + " \n 지출 : " + expensesAmount
                    );

                } else {
                    if (orderCnt <= latteStock) {
                        // 판매
                        // 재고 반영
                        latteStock -= orderCnt;
                        // 판매량 반영
                        latteSalesCnt += orderCnt;
                        // 잔고 반영
                        balance += lattePrice * orderCnt;
                        // 매출 반영
                        salesAmount += lattePrice * orderCnt;
                    } else {
                        // 매입
                        // 매입금액 산정
                        int purchasePrice = latteCost * orderCnt;

                        if (purchasePrice > balance) {
                            System.out.println(" system: 주문을 취소합니다.");
                            continue;
                        }

                        // 매입 + 판매
                        System.out.println("system: " + latteName + " 재고 " + orderCnt + "개 확보합니다.");
                        // 매입
                        // 재고 반영
                        latteStock += orderCnt;
                        // 잔고 반영
                        balance -= purchasePrice;
                        // 지출 반영
                        expensesAmount += purchasePrice;

                        // 판매
                        latteStock -= orderCnt;
                        // 판매량 반영
                        latteSalesCnt += orderCnt;
                        // 잔고 반영
                        balance += lattePrice * orderCnt;
                        // 매출 반영
                        salesAmount += lattePrice * orderCnt;
                    }

                    // 안전재고 기준선 확인
                    if (latteStock <= latteSafetyStock) {
                        // 매입금액 산정
                        int purchasePrice = latteSafetyStock * 2 * latteCost;
                        if (balance >= purchasePrice) {
                            // 매입
                            // 재고 반영
                            latteStock += latteSafetyStock * 2;
                            // 잔고 반영
                            balance -= purchasePrice;
                            // 지출 반영
                            expensesAmount += purchasePrice;
                        } else {
                            // 매입 실패
                            System.out.println(" system: 잔액부족으로 안전재고 확보 실패");
                        }
                    }

                    System.out.println("\n 제품명 : " + latteName
                        + " \n 판매가 : " + lattePrice
                        + " \n 판매수량 : " + orderCnt
                        + " \n 결재금액 : " + lattePrice * orderCnt
                        + " \n 남은 재고 : " + latteStock
                    );
                }

            } else {
                System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", americanoName, americanoStock,
                    americanoSalesCnt);
                System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", mochaName, mochaStock,
                    mochaSalesCnt);
                System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", latteName, latteStock,
                    latteSalesCnt);
                System.out.printf("잔고 : %4d | 매출 : %8d | 지출 : %8d \n", balance, salesAmount,
                    expensesAmount);
            }
        }
    }
}
