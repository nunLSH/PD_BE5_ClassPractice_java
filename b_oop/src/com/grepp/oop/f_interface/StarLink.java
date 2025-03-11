package com.grepp.oop.f_interface;

// NOTE F01 Interface
// inter + face
// 두 모듈이 만나는 지점(약속)을 interface 라 한다.
// 인터페이스는 인터페이스를 구현하는 모든 클래스들이 지켜야 하는 공통의 규약
// 다중 상속 및 다중 구현이 가능하다.
// ex) user interface : 사용자 <> 애플리케이션
public interface StarLink {

    // NOTE F03 : 인터페이스의 변수는 묵시적으로 public static final 이다.
    String INFO = "스타링크를 사용할 수 있는 제품입니다.";

    // NOTE F04 : 인터페이스의 메서드는 묵시적으로 public abstract 이다.
    void connect();

    // NOTE F05 : 인터페이스의 클래스메서드는 protected 를 사용할 수 없다. (상속(x), 구현(o))
    public static void callAgency(){
        System.out.println("일론머스크를 호출합니다.");
    }

    // NOTE F06 : default : 인터페이스 내에 구현되어 있는 인스턴스메서드
    default void disconnect(){
        System.out.println("===================");
        System.out.println(this);
        System.out.println("연결을 해제합니다.");
        System.out.println("===================");
    }


}
