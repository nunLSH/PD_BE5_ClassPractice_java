package com.grepp.greppcat.a_tcp.http.response;

public enum ResponseStartLine {

    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    ;

    private final String version;
    private final int statusCode;
    private final String statusMessage;

    ResponseStartLine(int statusCode, String statusMessage) {
        this.version = "HTTP/1.1";
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return version + " " + statusCode + " " + statusMessage + "\n";
    }
}