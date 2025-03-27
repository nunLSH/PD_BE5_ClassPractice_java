package com.grepp.thread.c_threadsafe;

public class Bottle {
    private String drink;

    public synchronized String input(String name, String drink){
        this.drink = drink;
        System.out.println(name + " : 물병에 " + this.drink + " 채웠습니다.");
        return this.drink;
    }
}
