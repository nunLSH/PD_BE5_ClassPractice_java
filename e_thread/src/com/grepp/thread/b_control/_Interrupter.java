package com.grepp.thread.b_control;

import java.util.Scanner;

public class _Interrupter {

    public void interrupt(Thread thread) {
        Scanner sc = new Scanner(System.in);
        System.out.println("빨리감기를 하려면 enter 를 눌러보세요.");

        while (true) {
            if (!thread.isAlive()) break;
            sc.nextLine();
            thread.interrupt();
        }
    }

}
