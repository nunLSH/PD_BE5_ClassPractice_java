package com.grepp.greppcat.a_tcp.servlet;

import com.grepp.greppcat.a_tcp.http.HttpHeader;
import com.grepp.greppcat.a_tcp.http.request.HttpRequest;
import com.grepp.greppcat.a_tcp.http.response.HttpResponse;
import com.grepp.greppcat.a_tcp.http.response.ResponseBody;
import com.grepp.greppcat.a_tcp.http.response.ResponseStartLine;

public class NotFoundServlet implements Servlet{

    @Override
    public HttpResponse doGet(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.NOT_FOUND,
            new HttpHeader(),
            new ResponseBody()
        );
    }

    @Override
    public HttpResponse doPost(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.NOT_FOUND,
            new HttpHeader(),
            new ResponseBody()
        );
    }
}
