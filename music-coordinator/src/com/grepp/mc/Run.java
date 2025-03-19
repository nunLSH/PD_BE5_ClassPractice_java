package com.grepp.mc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.grepp.mc.domain.song.Song;
import com.grepp.mc.domain.song.SongFormat;
import com.grepp.mc.presentation.Index;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Run {
    public static void main(String[] args) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String msg = "심심할 때 듣기 좋은 노래 추천해줘";
//
//        ChatModel model = new GeminiChatModel();
//        Response response = model.invoke(new TextRequest<>(msg, SongFormat.format));
//        List<Map<String, Object>> data = (List<Map<String, Object>>)
//            response.response();
//
//        List<Song> songs = data.stream().map(SongFormat::toVo).toList();
//        System.out.println(songs);

        new Index().index();

    }
}

