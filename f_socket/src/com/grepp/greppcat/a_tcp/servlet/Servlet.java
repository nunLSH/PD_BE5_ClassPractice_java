package com.grepp.greppcat.a_tcp.servlet;


import com.grepp.greppcat.a_tcp.http.response.HttpResponse;
import com.grepp.greppcat.a_tcp.http.request.HttpRequest;

public interface Servlet {

    HttpResponse doGet(HttpRequest request);
    HttpResponse doPost(HttpRequest request);

}