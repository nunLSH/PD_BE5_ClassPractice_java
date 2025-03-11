package com.grepp.oop.d_inheritance.b_overload;

// NOTE BA01 : overloading : 과적재
// 같은 이름을 가진 메서드가 여러 개 존재
// 매개변수의 목록이나, 타입이 달라야 한다.
// 반환타입은 오버로딩을 결정하는 요소가 아니다.
public class A_overloading {

    public int divide(int a, int b){
        return a/b;
    }

    // 매개변수의 목록을 다르게
    public int divide(int a, int b, int c){
        return a/b;
    }

    // 매개변수의 타입을 다르게
    public int divide(double a, int b){
        return (int) a/b;
    }

    // 반환타입은 overloading을 결정하는 요소가 아니다
//    public double divide(int a, int b){
//        double c = a;
//        return a/b;
//    }

    // NOTE BA02 가변인자
    // 메서드가 호출 될 때 인자를 여러 개 받을 수 있도록 하는 기능
    // 전달된 인자는 배열에 저장된다.
    // 가변인자는 매개변수 중 가장 마지막에 선언되어야 한다.
    public double plus(double a, double b, int...c){
        double res = a + b;
        System.out.println(c);
        for(double num : c){
            res += num;
        }

        return res;
    }

}
