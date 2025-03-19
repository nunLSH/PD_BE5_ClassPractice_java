package com.grepp.mc.domain.song;

import com.grepp.llm.gemini.text.vo.generation.PropertyType;
import java.util.Map;

public record SongFormat(
    PropertyType title,
    PropertyType artist,
    PropertyType reason
) {
    public static final SongFormat format =
        new SongFormat(PropertyType.STRING, PropertyType.STRING, PropertyType.STRING);

    public static Song toVo(Map<String, Object> data){
        return new Song((String) data.get("title"),
            (String) data.get("artist"),
            (String) data.get("reason"));
    }
}
