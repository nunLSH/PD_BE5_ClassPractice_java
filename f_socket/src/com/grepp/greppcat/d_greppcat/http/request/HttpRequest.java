package com.grepp.greppcat.d_greppcat.http.request;

import com.grepp.greppcat.d_greppcat.http.HttpHeader;

public record HttpRequest (
    RequestStartLine startLine,
    HttpHeader header,
    RequestParameter param
) {

}
