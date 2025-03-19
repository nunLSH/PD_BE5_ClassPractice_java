package com.grepp.llm.gemini.text.vo.generation;

import com.google.gson.annotations.SerializedName;

public record GenerationConfig<T>(
    @SerializedName("response_mime_type")
    String responseMimeType,
    @SerializedName("response_schema")
    Schema<T> responseSchema
) {

    public GenerationConfig(Schema<T> responseSchema) {
        this("application/json", responseSchema);
    }

    public GenerationConfig(T properties){
        this(new Schema<>(properties));
    }
}
