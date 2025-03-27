package com.grepp.greppcat.a_tcp;

public class Run {

    public static void main(String[] args) {
        new TcpServer(8989).start();
    }

}
