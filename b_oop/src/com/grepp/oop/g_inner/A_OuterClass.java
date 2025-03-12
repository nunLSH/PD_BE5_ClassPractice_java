package com.grepp.oop.g_inner;

public class A_OuterClass {
    private String desc;

    public A_OuterClass(String desc) {
        this.desc = desc;
    }

    // NOTE GA01 Static Inner Class
    public static class StaticInner{
        public void print(){
            System.out.println("Static Inner Class 입니다.");
        }
    }

    // NOTE GA02 Instance Inner Class
    public class InstanceInner{
        public void print(){
            System.out.println("============================");
            System.out.println(A_OuterClass.this);
            System.out.println(this);
            System.out.println(desc);
        }
    }
}
