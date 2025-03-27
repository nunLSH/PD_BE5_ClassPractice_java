package com.grepp.thread.b_control;

public class _Counter implements Runnable{

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(i + "초");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}
