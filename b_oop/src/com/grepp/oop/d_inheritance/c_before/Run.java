package com.grepp.oop.d_inheritance.c_before;

public class Run {

    public static void main(String[] args) {

        Desktop desktop = new Desktop(
            "삼성",
            "갤럭시북",
            2000000,
            "intel",
            true
        );

        SmartPhone smartPhone = new SmartPhone(
            "사과",
            "아이폰",
            1300000,
            "긱벤치",
            "SKT"
        );

        TV tv = new TV(
            "삼성",
            "스텐바이미",
            1000000,
            52
        );

        desktop.on();
        smartPhone.on();
        tv.on();

    }

}
