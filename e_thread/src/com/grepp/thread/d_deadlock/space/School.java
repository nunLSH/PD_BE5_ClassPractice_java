package com.grepp.thread.d_deadlock.space;

import com.grepp.thread.d_deadlock.transport.Bus;

public class School implements Destination{

    private static School instance;
    public static School getInstance(){
        if (instance == null){
            instance = new School();
        }

        return instance;
    }

    private School(){

    }

    @Override
    public synchronized void arrive(String name) {
        System.out.println(name + " 학교에 도착했습니다.");
    }

    @Override
    public synchronized void leave(String name) {
        Bus bus = Bus.getInstance();
        Home home = Home.getInstance();

        System.out.println(name + " 학교에서 떠납니다.");
        bus.drive(name, home);
        home.arrive(name);
    }
}
