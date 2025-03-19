package com.grepp.llm.gemini.text.vo.generation;

public record Item<T>(
    String type,
    T properties,
    Boolean nullable
){
    public Item(T properties){
        this("object", properties, true);
    }
}
