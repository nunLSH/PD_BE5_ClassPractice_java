package com.grepp.greppcat.a_tcp.servlet;

import com.grepp.greppcat.a_tcp.http.HttpMethod;
import com.grepp.greppcat.a_tcp.http.request.HttpRequest;
import com.grepp.greppcat.a_tcp.http.response.HttpResponse;

public class HandlerAdapter {

    public HttpResponse handle(HttpRequest request, Servlet servlet){

        HttpMethod method = request.startLine().method();

        if (method.equals(HttpMethod.GET)){
            return servlet.doGet(request);
        }

        return servlet.doPost(request);
    }

}
