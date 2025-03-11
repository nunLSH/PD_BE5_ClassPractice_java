package com.grepp.basic.a_variable;

public class B_상수 {

    public static void main(String[] args) {

        // NOTE AB01 final 예약어
        // final 예약어 : 변경이 불가능함   ex) 클래스 앞에 붙이면 확장 불가능, 상속 불가능

        // NOTE AB02 상수 : 초기화 이후 재할당이 불가능한 변수
        // 상수 명명 규칙 : Upper Snake 표기법
        // Snake 표기법 : 모든 단어를 소문자로 작성, 각 단어를 연결할 때, _ 를 사용하는 표기   ex) book_storage
        // Upper Snake 표기법 : 모든 단어를 대문자로 작성   ex) BOOK_STORAGE

        final int API_KEY = 71273918;
        // Cannot assign a value to final variable 'API_KEY'
        // err: API_KEY = 1;

        System.out.println(API_KEY);
    }
}
