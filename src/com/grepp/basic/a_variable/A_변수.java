package com.grepp.basic.a_variable;

public class A_변수 {

    public static void main(String[] args) {

        // NOTE AA01 : 데이터 자체 (literal)
        System.out.println("Z");
        System.out.println(1000);
        System.out.println(10.0001);

        // NOTE AA02 Type
        // 원시타입, 참조형타입(사용자정의 타입)
        // 원시타입
        // 논리형 : boolean(1)
        // 문자형 : char(2)
        // 숫사형 : byte(1), short(2), int(4), long(8), float(4), double(8)

        // NOTE AA03 변수 선언
        // 메모리에 타입의 크기만큼 공간을 확보하고 시작주소를 변수에 연결하는 과정
        // type 변수명;  ex) int i;

        // NOTE AA04 변수 명명 규칙 : Lower Camel Case

        // Camel Case : 단어를 연결할 때 각 단어의 첫 문자를 대문자로 표기  ex) bookAmount
        // Lower Camel Case : 첫 글자를 소문자로 시작  ex) bookAmount  >> 변수에서 사용
        // Upper Camel Case : 첫 글자를 대문자로 시작  ex) BookAmount  >> 클래스에서 사용

        boolean activated;
        char character;
        byte byteVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        // 변수는 초기화하지 않으면 사용할 수 없다.

        // Variable 'activated' might not have been initialized
        // err: System.out.println(activated);

        // NOTE AA05 초기화 : 선언한 변수에 최초로 값을 할당
        activated = true;
        character = 'A';
        byteVal = 100;
        shortVal  = 10000;
        intVal = 100000;
        // Integer number too large
        // 자바의 표준 정수형 타입은 int, 표준 실수형 타입은 double
        // literal 의 타입은 표준타입을 따라간다.
        // err: longVal = 10000000000;
        longVal = 1000000000L;
        // err: floatVal = 10.001;
        floatVal = 10.0f;
        doubleVal = 100.0211234;

        // NOTE AA06 재할당 : 초기화가 끝난 변수의 값을 다시 할당
        activated = false;
        character = 'a';  // 메모리에 저장되는 값은 97을 이진수로 변환한 수

        System.out.println(activated);

        // NOTE AA07 형변환(casting)
        System.out.println("=== 자동 형변환 ===");
        System.out.println(character);  // 'a'
        long ascii = character;
        System.out.println(ascii);  // 97 ('a')

        // NOTE AA08 명시적 형변환
        // 형변환을 하면 데이터가 손실될 위험이 있는 경우 자동 형변환을 지원하지 않는다.
        // case 1 : 크기가 큰 타입을 크기가 작은 타입으로 변환하려 할 때 => overflow 발생!
        // case 2 : 실수형 타입을 정수 타입으로 캐스팅 할 경우 실수부의 값이 손실
        System.out.println("=== 명시적 형변환 ===");

        // case 1
        long big = 100000000000L;
        // err: int small = big;
        int small = (int) big;
        System.out.println(small);

        int overflow = 128;
        byteVal = (byte) overflow;
        System.out.println(byteVal);  // -128

        // case 2
        // err: longVal = floatVal;
        longVal = (long) floatVal;
        System.out.println(longVal);

        // NOTE AA09 변수를 선언하는 방법들
        System.out.println("=== 변수 초기화 ===");
        // 변수 선언과 동시에 초기화
        int init = 10;

        // 다중 변수 선언
        int a, b, c;
        a = 10;
        b = 111;
        c = 200;

        // 다중 변수 초기화
        int x = 0, y = 10, z = 100;
        System.out.println(a);
        System.out.println(z);
    }
}
