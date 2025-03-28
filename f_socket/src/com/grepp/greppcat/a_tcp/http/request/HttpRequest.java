package com.grepp.greppcat.a_tcp.http.request;

import com.grepp.greppcat.a_tcp.http.HttpHeader;

public record HttpRequest (
    RequestStartLine startLine,
    HttpHeader header,
    RequestParameter param
) {

}
