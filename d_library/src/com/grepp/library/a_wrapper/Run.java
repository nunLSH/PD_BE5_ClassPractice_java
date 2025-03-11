package com.grepp.library.a_wrapper;


// NOTE AA01 Wrapper Class
// 순수 OOP 언어: 모든 것이 객체로 이루어진 언어
// 자바는 원시타입이 있기 때문에 순수 OOP 언어가 아니다.
// wrapper class: 자바가 원시타입을 객체로 대체할 수 있도록 제공해주는 클래스
public class Run {

    public static void main(String[] args) {

        // wrapper class와 원시타입간 변환이 자동으로 제공
        // auto boxing: 원시타입을 wrapper 객체로 변환
        // auto unboxing: wrapper 객체를 원시타입 변환

        Boolean activated = true;
        Character ch = 'A';
        Byte bNum = 100;
        Short sNum = 100;
        Integer num = 10000;
        Long lNum = 1000000L;
        Float fNum = 100.0f;
        Double dNum = 1000.0;

        // NOTE AA01 : wrapper 객체는 초기화하지 않을 경우 false, 0 대신 null이 들어간다.
        A_wrapper wrapper = new A_wrapper();
        System.out.println(wrapper);
    }
}
