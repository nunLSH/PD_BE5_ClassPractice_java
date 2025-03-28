package com.grepp.greppcat.a_tcp.exception;

public class ServletInitializeException extends RuntimeException{

    public ServletInitializeException(String message) {
        super(message);
    }

    public ServletInitializeException(String message, Throwable cause) {
        super(message, cause);
    }
}
