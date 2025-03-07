package com.grepp.basic.d_control;

import java.util.Scanner;

public class F_star {

    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
//        q4();
        q5();
//        q6();
    }
    
    private static void q1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("row: ");
        int row = sc.nextInt();
        System.out.print("col: ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(i == j) System.out.print(j);
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("num: ");
        int num = sc.nextInt();

        // 강사님 풀이
        for (int x = 1; x <= num; x++) {
            for (int i = 0; i < num - x; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < 2 * x - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int y = 1; y <= num - 1; y++) {
            for (int i = 0; i < y; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < 2 * (num - y) - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 나의 풀이
//        for (int i = 0; i < num; i++) {
//            for (int j = num - i; j > 1; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = i; j > 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < num - 1; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = num - i; j > 1; j--) {
//                System.out.print("* ");
//            }
//            for (int j = num - i - 1; j > 1; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    private static void q6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = num - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = num - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < num; i++) {
            for (int j = num - i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = num - i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
