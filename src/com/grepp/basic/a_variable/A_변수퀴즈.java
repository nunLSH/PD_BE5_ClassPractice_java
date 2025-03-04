package com.grepp.basic.a_variable;

public class A_변수퀴즈 {

    public static void main(String[] args) {
        char a = '자';
        char b = '기';

        // 조건 : 리터럴을 직접 대입해서 푸는 것은 금지
        char c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
