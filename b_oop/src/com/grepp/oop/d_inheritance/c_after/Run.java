package com.grepp.oop.d_inheritance.c_after;

import javax.swing.JComponent;

public class Run {

    public static void main(String[] args) {

        Desktop desktop = new Desktop(
            "삼성",
            "갤럭시북",
            2000000,
            "intel",
            true
        );

//        Computer computer = desktop;
//        Device device = desktop;

        Computer smartPhone = new SmartPhone(
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

        // Device 모양으로 되어있지만 각각의 인스턴스
        Device[] devices = {desktop, smartPhone, tv};
        for (Device device : devices){
            device.on();
            // 컴퓨터 타입을 가진 인스턴스는 스위치를 켠 다음 메모리 정리를 수횅
            if(device instanceof Computer computer){
                // down casting : 선조타입을 후손타입으로 변환
                // up casting : 후손타입을 선조타입으로 변환 (자동) >> 자식 타입에 부모 타입도 같이 있으므로
                // Computer computer = (Computer) device; 예전 방식
                computer.cleanUp();

            }
            System.out.println("===========================");
        }
    }
}
