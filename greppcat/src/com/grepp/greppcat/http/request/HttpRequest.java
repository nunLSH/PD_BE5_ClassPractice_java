package com.grepp.greppcat.http.request;

import com.grepp.greppcat.http.HttpHeader;

public record HttpRequest (
    RequestStartLine startLine,
    HttpHeader header,
    RequestParameter param
) {

}
