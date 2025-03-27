package com.grepp.thread.e_solution.character;

import com.grepp.thread.e_solution.space.Home;
import com.grepp.thread.e_solution.space.School;

public class Student extends Thread {

    public Student() {
    }

    public void run() {
        String name = getName();
        Home home = Home.getInstance();
        School school = School.getInstance();

        while(true){
            home.leave(name);
            school.arrive(name);
            school.leave(name);
            home.arrive(name);
        }
    }
}
