package com.grepp.library.c_collection.a_generic.domain;

public class Computer extends Device{

    protected String cpu;

    public Computer(String name, String cpu) {
        super(name);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "cpu='" + cpu + '\'' +
            '}';
    }
}
