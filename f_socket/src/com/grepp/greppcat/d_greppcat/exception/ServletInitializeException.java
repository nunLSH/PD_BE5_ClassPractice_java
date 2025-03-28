package com.grepp.greppcat.d_greppcat.exception;

public class ServletInitializeException extends RuntimeException{

    public ServletInitializeException(String message) {
        super(message);
    }

    public ServletInitializeException(String message, Throwable cause) {
        super(message, cause);
    }
}
