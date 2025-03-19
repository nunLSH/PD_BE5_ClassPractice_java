package com.grepp.llm;

public interface ChatModel {
    Response invoke(Request request);
}
