package com.grepp.greppcat.a_tcp.http.request;

import com.grepp.greppcat.a_tcp.http.HttpMethod;

public record RequestStartLine(
    HttpMethod method,
    String url,
    String queryString,
    String version
) {

}
