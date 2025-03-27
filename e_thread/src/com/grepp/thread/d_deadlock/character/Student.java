package com.grepp.thread.d_deadlock.character;

import com.grepp.thread.d_deadlock.space.Home;
import com.grepp.thread.d_deadlock.space.School;

public class Student extends Thread {

    public Student() {
    }

    public void run() {
        String name = getName();
        Home home = Home.getInstance();
        School school = School.getInstance();

        while(true){
            home.leave(name);
            school.leave(name);
        }
    }
}
