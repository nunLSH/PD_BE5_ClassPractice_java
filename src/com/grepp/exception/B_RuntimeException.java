package com.grepp.exception;

import java.util.Random;
import java.util.Scanner;

public class B_RuntimeException {

    public static void main(String[] args) {
//        arithEx();
        multiEx();
    }

    public static void arithEx(){
        Scanner sc = new Scanner(System.in);

        while (true){

            try{
                System.out.print("숫자 : ");
                int num = sc.nextInt();

                int random = new Random().nextInt(0,4);
                int result = num / random;
                System.out.println("나누어진 몫은 " + result + " 입니다.");

                if (num == 444) break;

            } catch (ArithmeticException e){
                System.out.println("0이 나와서 다시 입력해주세요.");
            }
        }
    }

    static void multiEx(){
        try {
            // ClassCastException >> UnChecked Exception
            Object obj = new Object();
            String str = (String) obj;

        } catch (ClassCastException e){
            System.out.println("ClassCastException의 catch block");
            System.out.println(e.getMessage());
        }
    }

}
