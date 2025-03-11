package com.grepp.basic.d_control;

import java.util.Scanner;

public class D_switch {

    // NOTE DD01 switch
    // 값 : 숫자, 문자, 문자열, enum
    // switch(값){
    //      case A : 코드블록 break;
    //      case B : 코드블록 break;
    //      case C : 코드블록 break;
    //      default : 코드블록
     //}

    // fall through : 값과 같은 case 값을 만나 코드블룩을 수행한 후, break를 만날 때까지 모든 코드블록을 실행
    // 가독성 문제로 사용하지 않는 것을 권장, 만약 쓴다면 주석이 필수
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        // 정수 두 개와 산술연산자를 입력 받아
        // 연산자에 해당하는 연산을 수행하고 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 두 개를 입력 (10 12) : ");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.print("산술 연산자(+ - * / %) : ");
        String operator = sc.next();

        int result = 0;
        switch (operator){
            case "+":
                System.out.println("+");
                result = x + y;
                break;
            case "-":
                System.out.println("-");
                result = x - y;
                break;
            case "*":
                System.out.println("*");
                result = x * y;
                break;
            case "/":
                System.out.println("/");
                result = x / y;
                break;
            case "%":
                System.out.println("%");
                result = x % y;
                break;
            default:
                System.out.println("잘못된 입력 값입니다.");
        }

        System.out.println("결과 : " + result);

    }
}
