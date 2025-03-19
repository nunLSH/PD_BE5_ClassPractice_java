package com.grepp.mc;


import com.grepp.llm.gemini.text.vo.generation.PropertyType;

public class BookFormat {
    private PropertyType title;
    private PropertyType reason;

    public BookFormat() {
        this.title = PropertyType.STRING;
        this.reason = PropertyType.STRING;
    }
}