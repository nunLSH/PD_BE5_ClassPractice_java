package com.grepp.exception;

// NOTE A01 Error와 예외(Exception)
// Error: 예측이 불가능하고 대응이 안 되는 문제
// Exception: 예측이 가능하고 대응이 가능한 문제, 사전에 예방 (예외처리)

// Compile Exception: 컴파일 시점에 발생하는 예외, IDE가 알려주는 예외
// Runtime Exception: 실행되는 시점에 발생하는 예외

import com.grepp.exception.custom.NotValidException;
import com.grepp.exception.custom.TimeOutException;
import java.awt.geom.NoninvertibleTransformException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
import java.util.SequencedCollection;

// Checked Exception: 코드로 예외처리가 불가능한 경우, 예외처리를 강제하는 Exception
// UnChecked Exception: 코드로 예외처리가 가능한 경우, 예외처리를 강제하지 않는 Exception

public class A_exception {

    // java.lang.ArithmeticException
    public void arithEx(){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("숫자 : ");
            int num = sc.nextInt();

            int random = new Random().nextInt(0,4);

            if (random == 0){
                System.out.println("0이 나와서 다시 입력해주세요.");
                continue;
            }

            int result = num / random;
            System.out.println("나누어진 몫은 " + result + " 입니다.");

            if (num == 444) break;
        }
    }

    // NOTE A02 try-catch-finally
    // try: 코드블록에 예외가 발생할 수 있는 코드를 작성
    // catch: 블록에 예외처리 코드를 작성
    // finally: 예외발생 여부와 상관없이 반드시 실행되어야 하는 코드 작성
    public void malformedURLEx(){

        try {
            URI url = URI.create("http://www.naver.com");
            System.out.println("URL 객체 생성 성공!");
        } catch (Exception e){
            System.out.println("잘못된 URL 입니다.");
            e.printStackTrace();
        } finally {
            System.out.println("연결을 종료합니다.");
        }
    }
}
