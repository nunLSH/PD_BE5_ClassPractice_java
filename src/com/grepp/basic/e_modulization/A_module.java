package com.grepp.basic.e_modulization;

public class A_module {

    public static void main(String[] args) {

        // 1. 111, 1111, 11111 중에서 최소값, 최대값, 중간값을 구하는 로직을 작성하시오.
        System.out.println("min: " + min(111,1111, 11111));
        System.out.println("max: " + max(111,1111, 11111));
        System.out.println("medium: " + medium(111,1111, 11111));

        System.out.println("========================");

        // 2. 222, 2222, 22222 중에서 최소값, 최대값, 중간값을 구하는 로직을 작성하시오.
        System.out.println("min: " + min(222, 2222,22222));
        System.out.println("max: " + max(222, 2222,22222));
        System.out.println("medium: " + medium(222, 2222,22222));

        System.out.println("========================");

        // 3. 333, 3333, 33333 중에서 최소값, 최대값, 중간값을 구하는 로직을 작성하시오.
        System.out.println("min: " + min(333, 3333,33333));
        System.out.println("max: " + max(333, 3333,33333));
        System.out.println("medium: " + medium(333, 3333,33333));

        System.out.println("========================");
    }

    // NOTE EA00 모듈 : 작업을 수행하는 독립적인 단위
    // 모듈화를 하는 이유
    // 1. 재사용성
    // 2. 가독성
    // 3. 유지보수 용이
    // 4. 하나의 모듈이 하나의 책임만 가지도록 작성  << 가장 우선시되어야 함 ***

    // NOTE EA01 *****
    // 매개변수 : 함수 외부에서 전달되는 값을 받기 위한 변수
    // 전달인자 : 매개변수에 전달되는 값
    // 반환타입 : 함수가 종료할 때 함수의 호출부로 전달할 값, 메서드 선언부의 return type을 명시적으로 지정해야한다.
    public static int min(int a, int b, int c){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static int max(int d, int e, int f) {
        int max = d;
        if (max < e) max = e;
        if (max < f) max = f;
        return max;
    }

    public static int medium(int g, int h, int i){
        int min = min(g, h, i);
        int max = max(g, h, i);

        if (g != max && g != min) {
            return g;
        }
        if (h != max && h != min) {
            return h;
        }
//        if (i != max && i != min) {
//            System.out.println("medium : " + i);
//        }
        return i;
    }
}
