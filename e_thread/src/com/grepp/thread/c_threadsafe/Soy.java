package com.grepp.thread.c_threadsafe;

public class Soy extends Thread{

    private Bottle bottle;

    public Soy(Bottle bottle) {
        this.bottle = bottle;
    }

    @Override
    public void run() {
        String name = getName();
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " : " + "간장 발견!");
            System.out.println(getName() + " : " + bottle.input(name, "간장") + " 냉장고에 넣는다.");
        }
    }
}
