package com.grepp.oop.a_modifier;

public class A_modifier {

    // NOTE AA01 접근제한자
    // 접근제한자 : public, protected, default(생략), private
    // 변수나 메서드에 접근할 수 있는 범위를 제한하는 제한자.

    // NOTE AA02 public : 다른 패키지에서 호출 가능
    public static void publicMethod(){
        System.out.println("public");
    }

    // NOTE AA03 protected : 같은 패키지 내의 클래스나, 상속관계인 클래스에서 호출 가능
    protected static void protectedMethod(){
        System.out.println("protected");
    }

    // NOTE AA04 default : 같은 패키지 내에서 호출 가능
    static void callPrivateMethod(){
        System.out.println("default");
        privateMethod();
    }

    // NOTE AA05 private : 같은 클래스 안에서 호출 가능
    private static void privateMethod(){
        System.out.println("private");
    }

}
