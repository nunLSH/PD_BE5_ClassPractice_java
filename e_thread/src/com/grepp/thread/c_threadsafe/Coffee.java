package com.grepp.thread.c_threadsafe;

public class Coffee extends Thread{

    private Bottle bottle;

    public Coffee(Bottle bottle) {
        this.bottle = bottle;
    }

    @Override
    public void run() {
        String name = getName();
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " : " + "coffee 발견!");
            System.out.println(getName() + " : " + bottle.input(name, "coffee") + " 마신다.");
        }
    }
}
