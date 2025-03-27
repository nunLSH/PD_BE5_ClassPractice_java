package com.grepp.thread.d_deadlock.transport;

import com.grepp.thread.d_deadlock.space.Destination;
import com.grepp.thread.d_deadlock.space.School;

public class Bus {

    private static Bus instance;
    public static Bus getInstance(){
        if (instance == null){
            instance = new Bus();
        }

        return instance;
    }

    private Bus(){
    }

    public void drive(String name, Destination destination) {
        System.out.println(name + " 버스에 올라탑니다.");
        destination.arrive(name);
    }
}
