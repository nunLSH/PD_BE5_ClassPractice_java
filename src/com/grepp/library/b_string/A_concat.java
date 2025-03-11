package com.grepp.library.b_string;

public class A_concat {

    // NOTE BA01 : String immutable(불변) 객체이다.
    public static void main(String[] args) {
//        concat();
//        concatStringWithBuffer();
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
