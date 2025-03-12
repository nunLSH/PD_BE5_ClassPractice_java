package com.grepp.library.c_collection.a_generic.domain;

public class SmartPhone extends Computer{

    private String agency;

    public SmartPhone(String name, String cpu, String agency) {
        super(name, cpu);
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
            "agency='" + agency + '\'' +
            ", cpu='" + cpu + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
