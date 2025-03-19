package com.grepp.llm.gemini.text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.grepp.llm.Request;
import com.grepp.llm.gemini.text.vo.RequestDocument;

public class TextRequest<T> implements Request {

    private String text;
    private T format;

    public TextRequest(String text, T format) {
        this.text = text;
        this.format = format;
    }

    @Override
    public String toJson() {
        Gson gson = new GsonBuilder()
            .serializeNulls()
            .setPrettyPrinting()
            .create();

        RequestDocument<T> doc = new RequestDocument<>(text, format);
        return gson.toJson(doc);
    }
}
