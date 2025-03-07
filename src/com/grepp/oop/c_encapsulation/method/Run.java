package com.grepp.oop.c_encapsulation.method;

import java.util.jar.JarOutputStream;

public class Run {

    public static void main(String[] args) {
        SpringConcert springConcert = new SpringConcert();
        SummerConcert summerConcert = new SummerConcert();
        WinterConcert winterConcert = new WinterConcert();

        springConcert.startConcert();
        System.out.println("===================");
        summerConcert.startConcert();
        System.out.println("===================");
        winterConcert.startConcert();
    }
}
