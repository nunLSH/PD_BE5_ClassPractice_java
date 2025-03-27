package com.grepp.thread.e_solution;

import com.grepp.thread.e_solution.character.Student;

public class Run {

    public static void main(String[] args) {
        Student mika = new Student();
        mika.setName("Mika");

        Student john = new Student();
        john.setName("John");

        mika.start();
        john.start();
    }
}
