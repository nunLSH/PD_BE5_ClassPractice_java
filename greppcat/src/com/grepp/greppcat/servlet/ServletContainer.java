package com.grepp.greppcat.servlet;

import com.grepp.greppcat.http.request.HttpRequest;
import com.grepp.greppcat.http.request.RequestParser;
import com.grepp.greppcat.http.response.HttpResponse;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingQueue;

public class ServletContainer implements Runnable {

    private LinkedBlockingQueue<Socket> taskQueue;

    public ServletContainer(LinkedBlockingQueue<Socket> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {

        HandlerMapping mapper = new HandlerMapping();
        HandlerAdapter adapter = new HandlerAdapter();
        RequestParser requestParser = new RequestParser();

        // http server 특징 stateless
        // 클라이언트의 상태를 저장하지 않는다.
        while(true){
            try(
                // 클라이언트의 최초 요청이 도착하면
                // 클라이언트와 1:1 통신을 하기 위한 소켓을 생성
                Socket socket = taskQueue.take();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            ){
                String startLine = reader.readLine();
                if(startLine == null) continue;

                HttpRequest request = requestParser.parse(startLine, reader);
                Servlet servlet = mapper.getHandler(request);
                HttpResponse response = adapter.handle(request, servlet);

                sendResponseHeader(response, writer);
                sendResponseBody(response, bos);

            } catch (IOException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException ignored) { }
        }
    }

    private void sendResponseBody(HttpResponse response, BufferedOutputStream bos)
        throws IOException {
        bos.write(response.body().getBody());
        bos.flush();
    }

    private void sendResponseHeader(HttpResponse response, PrintWriter writer) {
        writer.print(response.startLine());
        writer.print(response.httpHeader());
        writer.flush();
    }
}