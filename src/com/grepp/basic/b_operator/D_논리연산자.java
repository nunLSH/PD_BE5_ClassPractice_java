package com.grepp.basic.b_operator;

public class D_논리연산자 {

    // NOTE BD01 논리연산자 : &&(and), ||(or)
    // 논리형 타입의 연산 => 연산 결과 >> 논리형 타입
    // &&(and) : 두 개의 조건이 모두 참이면 true
    //           첫 조건의 결과가 거짓이면 두 번째 조건을 평가하지 않음
    // ||(or)  : 두 개의 조건 중 하나만 참이어도 true
    //           첫 조건의 결과가 참이면 두 번째 조건을 평가하지 않음

    public static void main(String[] args) {
        System.out.println("=== and ===");
        System.out.println(2 >= 2 && 2 > 3);  // true && false = false
        System.out.println(2 > 1 && 3 > 2);  // true && true = true
        System.out.println(3 < 2 && 2 > 3);  // false && false = false
        System.out.println(3 < 2 && 2 > 1);  // false && true = false

        System.out.println("=== or ===");
        System.out.println(2 >= 2 || 2 > 3);  // true || false = true
        System.out.println(2 > 1 || 3 > 2);  // true || true = true
        System.out.println(3 < 2 || 2 > 3);  // false || false = false
        System.out.println(3 < 2 || 2 > 1);  // false || true = true

        // NOTE BD02 논리연산의 우선순위 : &&가 ||보다 연산 우선 순위가 높다.
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        System.out.println("=== 논리연산자 우선순위 ===");
        // 아래 논리연산의 결과를 예상해보세요.
        System.out.println(a || b && c || d);  // true
        // b && c = false && false = false
        // a || false = true || false = true
        // true || d = true || false = true

        // 연산 우선 순위 변경 : ()
        System.out.println((a || b) && (c || d));  // false
    }
}
