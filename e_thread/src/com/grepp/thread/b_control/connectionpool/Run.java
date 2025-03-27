package com.grepp.thread.b_control.connectionpool;

public class Run {

    public static void main(String[] args) {

        ConnectionPool pool = new ConnectionPool(5);
        for (int i = 0; i < 6; i++) {
            new Thread(new Worker(pool, 1000)).start();
        }
    }

}
