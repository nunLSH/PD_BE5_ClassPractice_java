package com.grepp.llm.gemini.text.vo.generation;

public class PropertyType {

    public static final PropertyType BOOLEAN = new PropertyType("boolean");
    public static final PropertyType STRING = new PropertyType("string");
    public static final PropertyType NUMBER = new PropertyType("number");
    public static final PropertyType ARRAY = new PropertyType("array");
    public static final PropertyType OBJECT = new PropertyType("object");

    private final String type;

    private PropertyType(String type) {
        this.type = type;
    }
}
