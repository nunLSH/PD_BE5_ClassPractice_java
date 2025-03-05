package com.grepp.basic.b_operator;

public class G_복합대입연산자 {

    // = : 대입연산자
    // NOTE BG01 복합대입연산 : 산술연산 + 대입연산
    // +=, -=, *=, /=, %=

    public static void main(String[] args) {

        int num = 12;
        // num = num + 12;
        num += 12;
        System.out.println(num);

        num -= 12;
        System.out.println(num);

        num *= 12;
        System.out.println(num);

        num /= 12;
        System.out.println(num);

        num %= 11;
        System.out.println(num);
    }
}
