package com.grepp.greppcat.a_tcp.http.response;

import com.grepp.greppcat.a_tcp.http.HttpHeader;

public record HttpResponse(
    ResponseStartLine startLine,
    HttpHeader httpHeader,
    ResponseBody body
) {



}