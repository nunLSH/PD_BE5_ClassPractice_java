package com.grepp.library.c_collection.a_generic.domain;

public class TV extends Device{

    private int size;

    public TV(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TV{" +
            "size=" + size +
            '}';
    }
}
