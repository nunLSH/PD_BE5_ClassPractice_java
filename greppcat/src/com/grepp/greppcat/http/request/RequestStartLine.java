package com.grepp.greppcat.http.request;

import com.grepp.greppcat.http.HttpMethod;

public record RequestStartLine(
    HttpMethod method,
    String url,
    String queryString,
    String version
) {

}
