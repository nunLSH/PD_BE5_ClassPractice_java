package com.grepp.oop.d_inheritance.a_override;

// NOTE DA01 상속
// Object : 자바 클래스 상속 계층의 root 클래스
// 자바의 모든 클래스는 Object 클래스를 상속받고 있다.
// 상속 : is-a 관계
// 속성으로 다른 클래스를 가진 경우 : has-a 관계
// 메서드 내에서 다른 클래스의 매서드를 호출 : use-a 관계

import java.util.Objects;

public class A_object {
    private String name;
    private String desc;

    public A_object(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // Object class 의 toString 은 full qualified name + '@' + hashcode 를 반환하지만
    // A_object 클래스의 toString 은 이름과 설명에 대한 내용으로 반환하고 싶다.

    // NOTE DA02 : override
    // override : 재정의, 부모클래스로부터 상속 받은 메서드를 자식클래스에서 재정의하는 것
    //            반환타입, 매개변수, 이름이 일치해야 한다.
    //            접근제한자는 더 넓은 범위로만 재정의 할 수 있다.
    //            protected -> public(o)    public -> protected(x)

    // NOTE DA03 : annotation
    // annotation : 주석 (코드에 대한 정보), 메타데이터(데이터에 대한 데이터)
    // 컴파일되거나 실행되는 시점에 컴파일러 및 외부 모듈에게 필요한 정보를 전달
    // @Override : 이 메서드는 부모클래스로부터 상속받은 메서드를 override 한 메서드임을 컴파일러에게 전달
    //             컴파일러는 부모클래스에 이 메서드와 반환타입, 매개변수, 이름이 일치하는 메서드가 있는지 확인 후 없으면 에러
    @Override
    public String toString() {
        return "A_object{" +
            "name='" + name + '\'' +
            ", desc='" + desc + '\'' +
            '}';
    }

    // NOTE DA03 : 동일성과 동등성
    // 동일성 : 주소값으로 비교 (Object 클래스의 equals)
    // 동등성 : 객체의 속성에 담긴 값이 같으면 같은 객체로 판단
    // instanceof : 특정 클래스의 인스턴스인지 판단

    @Override  // 동등성 비교
    public boolean equals(Object o) {
        // o가 A_object 의 instance 인지 판단
        if (!(o instanceof A_object aObject)) {
            return false;
        }
        return Objects.equals(name, aObject.name) && Objects.equals(desc,
            aObject.desc);
    }

    // hash : 어떤 데이터를 일정한 크기(bit 수)의 값으로 변환하는 것.
    // 해시함수의 규칙
    //      1. 같은 값을 넣으면 언제나 같은 해시값을 반환해야 한다.
    //      2. 다른 값을 넣으면 언제나 다른 해시값을 반환해야 한다.
    // ex) SHA-256 해시함수 : 어떤 데이터를 256bit 의 데이터로 변환하는 함수

    // 같은 객체라면 언제나 같은 해시값을 가져야 하기 때문에,
    // 객체의 같음을 판단하는 equals 가 override 되었다면, hashCode 함께 override 되어야 한다.
    @Override
    public int hashCode() {
        return Objects.hash(name, desc);
    }
}
