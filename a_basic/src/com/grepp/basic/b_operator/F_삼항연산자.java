package com.grepp.basic.b_operator;

public class F_삼항연산자 {

    public static void main(String[] args) {
        // NOTE BF01 삼항연산자 >> 조건 ? 참일 때 연산 : 거짓일 때 연산

        int x = 100;
        int y = 3;

        int res = x == y ? x + y : x - y;
        System.out.println(res);
    }
}
