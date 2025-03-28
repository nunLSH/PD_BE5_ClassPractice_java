package com.grepp.greppcat.servlet;

import com.grepp.greppcat.http.HttpHeader;
import com.grepp.greppcat.http.request.HttpRequest;
import com.grepp.greppcat.http.response.HttpResponse;
import com.grepp.greppcat.http.response.ResponseBody;
import com.grepp.greppcat.http.response.ResponseStartLine;

public class NotFoundServlet implements Servlet {

    public HttpResponse doGet(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.NOT_FOUND,
            new HttpHeader(),
            new ResponseBody()
        );
    }

    public HttpResponse doPost(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.NOT_FOUND,
            new HttpHeader(),
            new ResponseBody()
        );
    }
}