package com.grepp.oop.d_inheritance.c_after;

public class Computer extends Device{

    protected String cpu;

    public Computer(String brand, String name, int price, String cpu) {
        super(brand, name, price);
        this.cpu = cpu;
    }

    @Override
    public void on() {
        System.out.println("cpu : " + cpu);
        super.on();
    }

    public void cleanUp() {
        System.out.println("메모리 정리를 수행합니다.");
    }
}
