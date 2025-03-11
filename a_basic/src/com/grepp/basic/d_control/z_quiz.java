package com.grepp.basic.d_control;

import java.util.Scanner;

public class z_quiz {

    public static void main(String[] args) {
        quiz();
    }

    // q.
    // 1P 유저로부터 가위/바위/보 중 하나를 입력받으세요
    // 2P 유저로부터 가위/바위/보 중 하나를 입력받으세요.
    // 1P 유저기준에서 승/패/비김 여부를 출력해주세요.
    public static void quiz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1P :" );
        String p1 = sc.next();
        System.out.print("2P : ");
        String p2 = sc.next();

        // early return 빠른 리턴
        if (p1.equals(p2)){
            System.out.println("비김");
            return;
        }

        String result = winOrLose(p1, p2);
        System.out.println(result);
    }

    private static String winOrLose(String p1, String p2) {
        if(p1.equals("가위") && p2.equals("보")){
            return "이김";
        } else if (p1.equals("바위") && p2.equals("가위")) {
            return "이김";
        } else if (p1.equals("보") && p2.equals("바위")){
            return "이김";
        } else {
            return "짐";
        }
    }

}
