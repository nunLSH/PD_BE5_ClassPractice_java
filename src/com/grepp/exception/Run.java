package com.grepp.exception;

import com.grepp.exception.custom.TimeOutException;
import java.net.MalformedURLException;

public class Run {

    // main 메서드에서 마저 throws를 하면 JVM이 예외처리를 해준다.
    // 단, 이 경우는 개발자가 예외처리를 하는 것이 아니기 때문에 권장하지 않는다.
    public static void main(String[] args) {

        A_exception ex = new A_exception();
//        runtime.arithEx();
        ex.malformedURLEx();
    }
}
