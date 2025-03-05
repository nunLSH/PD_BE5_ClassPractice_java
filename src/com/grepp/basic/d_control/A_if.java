package com.grepp.basic.d_control;

import java.util.Scanner;

public class A_if {

    // NOTE DA01 제어문 : 코드의 흐름을 제어
    // 조건문, 반복문
    public static void main(String[] args) {

        // NOTE DA02 단독 if문
        // if(조건식){코드블록}
        // 조건식이 참이면 코드블록을 실행, 거짓이면 무시

        System.out.println("\n=== 양수 판별기 ===\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");

        // nextInt() : 사용자가 입력한 값을 int로 casting하여 변수에 전달
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("양수입니다.");
        }

        System.out.println("===================");

        System.out.println("아내: 여보 우유 하나 사와. 만약 아보카도 있으면 6개 사와.");
        int milkCnt = 1;

        System.out.print("아보카도가 있나요? : ");
        boolean exists = sc.nextBoolean();

        if (exists) {
            milkCnt = 6;
        }

        System.out.println("남편: 우유 " + milkCnt + "개 사 왔어.");
    }
}
