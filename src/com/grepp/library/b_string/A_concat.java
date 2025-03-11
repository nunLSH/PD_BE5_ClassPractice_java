package com.grepp.library.b_string;

public class A_concat {

    // NOTE BA01 : String immutable(불변) 객체이다.
    // StringBuilder, StringBuffer 를 사용하면 문자열을 mutable 하게 다룰 수 있다.
    // 따라서 문자열 결합을 할 때는 StringBuffer(thread-safe)를 사용한다.
    public static void main(String[] args) {
//        concat();
//        concatStringWithBuffer();
        concatWithStringBuilder();
    }

    private static void concatWithStringBuilder() {
        StringBuilder java = new StringBuilder("JAVA");
        System.out.println(System.identityHashCode(java));
        java = java.append(2);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }

    private static void concatStringWithBuffer() {
        StringBuffer java = new StringBuffer("JAVA");
        System.out.println(System.identityHashCode(java));
        java = java.append(2);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }

    private static void concat() {
        String java = "JAVA";
        System.out.println(System.identityHashCode(java));
        java = java + 2;
        System.out.println(System.identityHashCode(java));
    }

}
