package com.grepp.oop.d_inheritance.c_before;

public class TV {

    private String brand;
    private String name;
    private int price;
    private int size;

    public TV(String brand, String name, int price, int size) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public void on(){
        System.out.println(name + " 켰습니다.");
    }

    @Override
    public String toString() {
        return "TV{" +
            "brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", size=" + size +
            '}';
    }
}
