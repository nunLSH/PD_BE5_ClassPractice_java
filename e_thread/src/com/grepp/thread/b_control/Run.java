package com.grepp.thread.b_control;

public class Run {

    // NOTE EB01 Thread 상태
    // 실행, 실행대기, 일시정지, 중지
    public static void main(String[] args) {
        Thread t1 = new Thread(new _Counter());
        t1.start();
        new _Interrupter().interrupt(t1);
    }

}
