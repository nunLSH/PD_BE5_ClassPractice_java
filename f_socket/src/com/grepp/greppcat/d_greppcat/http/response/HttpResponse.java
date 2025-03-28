package com.grepp.greppcat.d_greppcat.http.response;

import com.grepp.greppcat.d_greppcat.http.HttpHeader;

public record HttpResponse(
    ResponseStartLine startLine,
    HttpHeader httpHeader,
    ResponseBody body
) {



}