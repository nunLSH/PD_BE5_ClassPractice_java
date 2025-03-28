package com.grepp.greppcat.a_tcp;

import com.grepp.greppcat.a_tcp.http.request.HttpRequest;
import com.grepp.greppcat.a_tcp.http.request.RequestParser;
import com.grepp.greppcat.a_tcp.http.response.HttpResponse;
import com.grepp.greppcat.a_tcp.servlet.HandlerAdapter;
import com.grepp.greppcat.a_tcp.servlet.HandlerMapping;
import com.grepp.greppcat.a_tcp.servlet.Servlet;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

    private ServerSocket serverSocket;
    private ThreadPool threadPool;

    public TcpServer(int port, int threadCnt) {
        try {
            serverSocket = new ServerSocket(port);
            threadPool = ThreadPool.init(threadCnt);

            System.out.println("server start(port : " + port + ")" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        while(true){
            try{
                threadPool.addTask(serverSocket.accept());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}