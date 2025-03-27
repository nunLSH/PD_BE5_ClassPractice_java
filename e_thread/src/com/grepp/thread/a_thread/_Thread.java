package com.grepp.thread.a_thread;

// NOTE EA01 쓰래드 생성
// Thread 클래스 상속
// Runnable 인터페이스를 구현 -> 구현체를 Thread 클래스의 생성자 매개변수로 전달
public class _Thread extends Thread{

    // NOTE EA02 새로운 쓰래드의 main 메서드
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }
    }
}
