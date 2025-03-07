package com.grepp.oop.a_modifier;

public class Run {

    public static void main(String[] args) {
        A_modifier.publicMethod();
        A_modifier.protectedMethod();
        A_modifier.callPrivateMethod();
        // A_modifier.privateMethod(); 호출 불가능(같은 클래스 내에서만 사용)
    }

}
