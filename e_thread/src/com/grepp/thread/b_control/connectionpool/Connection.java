package com.grepp.thread.b_control.connectionpool;

public class Connection {

    private final String name;

    public Connection(String name) {
        this.name = name;
    }

    public void connect(String worker){
        System.out.println(worker + " : " + this.name + " connected");
    }

    public String getName() {
        return name;
    }
}
