package com.grepp.thread.d_deadlock.space;

import com.grepp.thread.d_deadlock.transport.Bus;

public class Home implements Destination{

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
        School school = School.getInstance();

        System.out.println(name + " 집을 떠납니다.");
        bus.drive(name, school);
        school.arrive(name);
    }
}
