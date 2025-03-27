package com.grepp.thread.a_thread.runnable;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
