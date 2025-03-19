package com.grepp.mc.infra.error;

public class CommonException extends RuntimeException{

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }
}
