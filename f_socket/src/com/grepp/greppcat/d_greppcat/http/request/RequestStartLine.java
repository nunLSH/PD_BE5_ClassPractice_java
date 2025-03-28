package com.grepp.greppcat.d_greppcat.http.request;

import com.grepp.greppcat.d_greppcat.http.HttpMethod;

public record RequestStartLine(
    HttpMethod method,
    String url,
    String queryString,
    String version
) {

}
