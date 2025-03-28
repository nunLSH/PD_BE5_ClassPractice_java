package com.grepp.greppcat.a_tcp.domain;

import com.grepp.greppcat.a_tcp.http.HttpHeader;
import com.grepp.greppcat.a_tcp.http.request.HttpRequest;
import com.grepp.greppcat.a_tcp.http.response.HttpResponse;
import com.grepp.greppcat.a_tcp.http.response.ResponseBody;
import com.grepp.greppcat.a_tcp.http.response.ResponseStartLine;
import com.grepp.greppcat.a_tcp.servlet.Servlet;
import java.nio.charset.StandardCharsets;

public class IndexController implements Servlet {

    @Override
    public HttpResponse doGet(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.OK,
            new HttpHeader(),
            new ResponseBody().addBody("Welcome Index".getBytes(StandardCharsets.UTF_8))
        );
    }

    @Override
    public HttpResponse doPost(HttpRequest request) {
        return null;
    }
}
