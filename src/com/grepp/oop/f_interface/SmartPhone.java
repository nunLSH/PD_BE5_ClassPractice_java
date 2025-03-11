package com.grepp.oop.f_interface;

// NOTE F02 implements
// 클래스에서 interface를 구현할 때 선언
// 인터페이스의 구현은 상속과 마찬가지로, 타입을 물려준다.
public class SmartPhone extends Computer implements StarLink, Https {

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

    @Override
    public void connect() {
        System.out.println("인공위성에 연결합니다.");
    }

    @Override
    public void send() {
        System.out.println("메세지를 전송합니다.");
    }

    @Override
    public void receive() {
        System.out.println("메세지를 받습니다.");
    }

    @Override
    public void encrypt() {
        System.out.println("암호화 합니다.");
    }
}
