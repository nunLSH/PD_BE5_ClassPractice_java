package com.grepp.thread.b_control.connectionpool;

public class Worker implements Runnable{

    private final ConnectionPool pool;
    private final int delay;

    public Worker(ConnectionPool pool, int delay) {
        this.pool = pool;
        this.delay = delay;
    }

    @Override
    public void run() {

        Thread thread = Thread.currentThread();
        while(true){
            try {
                Connection conn = pool.getConnection();
                System.out.println(thread.getName() + " : get " + conn.getName());

                work(conn, thread);

                System.out.println(thread.getName() + " : return " + conn.getName());
                pool.returnConnection(conn);

                Thread.sleep(delay);

            } catch (InterruptedException ignored) { }
        }
    }

    private void work(Connection conn, Thread thread) throws InterruptedException {
        conn.connect(thread.getName());
        Thread.sleep(delay);
    }
}
