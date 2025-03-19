package com.grepp.llm.gemini.text.vo;

public record Candidate (
    Content content,
    String finishReason,
    Double avgLogprobs
){

}
