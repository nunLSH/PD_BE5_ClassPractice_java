package com.grepp.library.c_collection.a_generic.domain;

public class Device {

    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " 켜졌습니다.");
    }

    @Override
    public String toString() {
        return "Device{" +
            "name='" + name + '\'' +
            '}';
    }
}
