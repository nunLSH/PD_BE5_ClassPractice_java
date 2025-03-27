package com.grepp.thread.e_solution.space;

import com.grepp.thread.e_solution.transport.Bus;

public class Home implements Destination {

    private static Home instance;
    public static Home getInstance(){
        if (instance == null){
            instance = new Home();
        }

        return instance;
    }

    private Home(){

    }

    @Override
    public synchronized void arrive(String name) {
        System.out.println(name + " 집에 도착했습니다.");
    }

    @Override
    public synchronized void leave(String name) {
        Bus bus = Bus.getInstance();
        System.out.println(name + " 집을 떠납니다.");
        bus.drive(name);
    }
}
