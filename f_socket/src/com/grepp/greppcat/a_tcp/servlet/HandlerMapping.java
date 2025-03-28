package com.grepp.greppcat.a_tcp.servlet;

import com.grepp.greppcat.a_tcp.http.request.HttpRequest;

public class HandlerMapping {

    public Servlet getHandler(HttpRequest request){
        ServletStorage storage = ServletStorage.getInstance();

        Servlet servlet = storage.getServlet(request.startLine().url());
        if (servlet == null) return new NotFoundServlet();
        return servlet;
    }
}
