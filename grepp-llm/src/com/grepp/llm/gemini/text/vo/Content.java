package com.grepp.llm.gemini.text.vo;

import java.util.List;

public record Content(
    List<Part> parts,
    String role
) {

    public Content(String text) {
        this(List.of(new Part(text)), null);
    }
}
