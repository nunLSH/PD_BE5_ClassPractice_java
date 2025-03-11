package com.grepp.basic.c_prepare;

// java.lang 패키지는 import문을 선언하지 않아도 자동으로 import
// java.lang : 자바로 프로그래밍할 때 가장 많이 사용할 클래스들을 모아놓은 그룹
// full qualified name 대신 클래스명을 사용하기 위해 미리 full qualified name을 선언
import java.util.Scanner;

// NOTE CB00 Package : 연관된 클래스들의 그룹
// 자바에서 full qualified name 은 중복될 수 없다(고유해야 한다)
// 패키지명 : com.grepp.basic.c_prepare
// 클래스명 : B_Scanner
// full qualified name : com.grepp.basic.c_prepare.B_Scanner   >> 패키지명 + 클래스명

// 패키지명 규칙 : 회사의 도메인 + 프로젝트명  >> 유니크하게 명명하기 위한 규칙
// ex) com.naver.pay.a_variable
public class B_Scanner {

    public static void main(String[] args) {

        // NOTE CB01 Scanner : 입력받은 값을 읽고 처리하는 객체
        // System.in : 시스템의 표준 입력 장치 : 키보드
        Scanner sc = new Scanner(System.in);
        System.out.print("email password: ");

        // sc.next();
        // 1. 사용자의 입력을 대기한다.
        // 2. 입력한 값을 공백문자를 기준으로 나누어 하나씩 반환한다.
        String email = sc.next();
        System.out.println(email);

        String password = sc.next();
        System.out.println(password);
    }
}
