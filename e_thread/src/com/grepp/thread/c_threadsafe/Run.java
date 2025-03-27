package com.grepp.thread.c_threadsafe;

public class Run {

    public static void main(String[] args) {
        Bottle bottle = new Bottle();

        Coffee coffee = new Coffee(bottle);
        coffee.setName("미카");

        Soy soy = new Soy(bottle);
        soy.setName("앤드류");

        coffee.start();
        soy.start();
    }
}
