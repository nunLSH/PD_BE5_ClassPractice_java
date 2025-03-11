package com.grepp.oop.d_inheritance.c_after;

public class SmartPhone extends Computer{

    private String agency;

    public SmartPhone(String brand, String name, int price, String cpu, String agency) {
        super(brand, name, price, cpu);
        this.agency = agency;
    }

    @Override
    public void on() {
        System.out.println("agency : " + agency);
        super.on();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
            "agency='" + agency + '\'' +
            ", cpu='" + cpu + '\'' +
            ", brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
