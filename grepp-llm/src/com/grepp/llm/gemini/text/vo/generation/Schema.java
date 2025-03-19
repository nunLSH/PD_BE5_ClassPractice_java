package com.grepp.llm.gemini.text.vo.generation;

public record Schema<T>(
    String type,
    Item<T> items
) {

    public Schema(Item<T> items) {
        this("ARRAY", items);
    }

    public Schema(T properties){
        this(new Item<>(properties));
    }


}
