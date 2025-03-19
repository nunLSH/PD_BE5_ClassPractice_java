package com.grepp.llm.gemini.text.vo;

import com.grepp.llm.gemini.text.vo.generation.GenerationConfig;
import java.util.List;

public record RequestDocument<T>(
    List<Content> contents,
    GenerationConfig<T> generationConfig
) {

    public RequestDocument(String text, T format) {
        this(List.of(new Content(text)), new GenerationConfig<>(format));
    }
}
