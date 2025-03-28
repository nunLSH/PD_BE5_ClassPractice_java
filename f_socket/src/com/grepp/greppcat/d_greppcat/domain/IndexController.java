package com.grepp.greppcat.d_greppcat.domain;

import com.grepp.greppcat.d_greppcat.http.HttpHeader;
import com.grepp.greppcat.d_greppcat.http.request.HttpRequest;
import com.grepp.greppcat.d_greppcat.http.response.HttpResponse;
import com.grepp.greppcat.d_greppcat.http.response.ResponseBody;
import com.grepp.greppcat.d_greppcat.http.response.ResponseStartLine;
import com.grepp.greppcat.d_greppcat.servlet.Servlet;
import com.grepp.greppcat.d_greppcat.servlet.annotation.EndPoint;
import com.grepp.greppcat.d_greppcat.servlet.annotation.RequestMapping;
import java.nio.charset.StandardCharsets;

@RequestMapping(url = "/")
public class IndexController implements Servlet {

    @EndPoint(url = "")
    public HttpResponse index(HttpRequest request) {
        return new HttpResponse(
            ResponseStartLine.OK,
            new HttpHeader(),
            new ResponseBody().addBody("Welcome Index".getBytes(StandardCharsets.UTF_8))
        );
    }
}
