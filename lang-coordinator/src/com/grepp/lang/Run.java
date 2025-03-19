package com.grepp.lang;

import com.grepp.lang.vo.Lang;
import com.grepp.lang.vo.LangFormat;
import com.grepp.llm.ChatModel;
import com.grepp.llm.Response;
import com.grepp.llm.gemini.text.GeminiChatModel;
import com.grepp.llm.gemini.text.TextRequest;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        String msg = "백앤드 개발자가 공부해야하는 프로그래밍 언어 추천해줘";

        ChatModel model = new GeminiChatModel("1.5"
            , "AIzaSyAro1HcDM1LCJ5b8lNmHCheQtw7mmpXOEw");

        Response response = model.invoke(new TextRequest<>(msg, LangFormat.format));
        List<Lang> langs =  response.response().stream().map(e -> LangFormat.toVo(e)).toList();
        System.out.println(langs);

    }
}