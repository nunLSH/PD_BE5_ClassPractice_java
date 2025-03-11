package com.grepp.oop.d_inheritance.a_override;

public class Run {

    public static void main(String[] args) {
        A_object obj = new A_object("object", "root class");
        A_object obj2 = obj;
        System.out.println(obj);
        System.out.println(obj.equals(obj2));

    }

}
