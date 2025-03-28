package com.grepp.greppcat.http.response;

import com.grepp.greppcat.http.HttpHeader;

public record HttpResponse(
    ResponseStartLine startLine,
    HttpHeader httpHeader,
    ResponseBody body
) {



}