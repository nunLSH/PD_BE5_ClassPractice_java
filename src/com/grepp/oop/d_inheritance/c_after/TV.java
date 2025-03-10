package com.grepp.oop.d_inheritance.c_after;

// Device 클래스를 상속받는다.

// NOTE DC00 상속
// 부모클래스의 속성, 기능, 타입을 물려받는 것
// 자바는 부모클래스가 하나만 존재한다.
public class TV extends Device{

    private int size;

    // NOTE DC01 super
    // super() : 부모 클래스의 생성자, 생성자의 첫 줄에서 위치
    // super : 부모 클래스의 인스턴스를 참조하는 변수
    public TV(String brand, String name, int price, int size) {
        super(brand, name, price);
        this.size = size;
    }

    @Override
    public void on() {
        System.out.println("size : " + size + " inch");
        super.on();
    }

    @Override
    public String toString() {
        return "TV{" +
            "size=" + size +
            ", brand='" + super.brand + '\'' +
            ", name='" + super.name + '\'' +
            ", price=" + super.price +
            '}';
    }
}
