package com.grepp.oop.a_modifier.test;

import com.grepp.oop.a_modifier.A_modifier;

public class Run {

    public static void main(String[] args) {
        A_modifier.publicMethod();
        // public 외의 메서드 호출 불가능 >> 패키지가 다르기 때문(해당 패키지 안에 있는 패키지더라도 다른 패키지)
    }

}
