package com.grepp.llm.error;

public class LLMException extends RuntimeException{
    public LLMException(String message) {super(message);}
    public LLMException(String message, Throwable cause) { super(message, cause);}

}
