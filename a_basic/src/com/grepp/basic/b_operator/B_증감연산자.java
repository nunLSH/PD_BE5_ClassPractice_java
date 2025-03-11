package com.grepp.basic.b_operator;

public class B_증감연산자 {

    public static void main(String[] args) {

        // NOTE BB01 증감연산자 : ++, --
        // ++ : 값을 1 증가시킴
        // -- : 값을 1 감소시킴
        // 전위연산자(++변수, --변수) : 연산 전에 증감처리
        // 후위연산자(변수++, 변수--) : 연산 후에 증감처리

        int x = 10;
        System.out.println(++x);
        System.out.println(--x);
        System.out.println("===============");
        System.out.println(x + ++x);  // 21
        System.out.println(x + x++);  // 22 => x: 12
        System.out.println(x + x);    // 24
        System.out.println(x + x--);  // 24 => x: 11
        System.out.println(x + --x);  // 21
    }
}
