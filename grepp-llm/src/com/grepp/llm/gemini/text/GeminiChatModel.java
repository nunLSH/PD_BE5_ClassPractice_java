package com.grepp.llm.gemini.text;


import com.grepp.llm.ChatModel;
import com.grepp.llm.Request;
import com.grepp.llm.Response;
import com.grepp.llm.error.LLMException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class GeminiChatModel implements ChatModel {

    private final String API_URL;
    private final String API_KEY;

    public GeminiChatModel(String version, String apiKey) {
        this.API_URL = "https://generativelanguage.googleapis.com"
            + "/v1beta"
            + "/models"
            + "/gemini-" + version + "-flash:generateContent";
        this.API_KEY = apiKey;
    }

    @Override
    public Response invoke(Request request) {

        String body = request.toJson();

        try (
            HttpClient client = HttpClient.newBuilder()
                .version(Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        ) {
            HttpRequest requestClient = HttpRequest.newBuilder()
                .uri(URI.create(
                    API_URL + "?key=" + API_KEY))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(body))
                .build();

            HttpResponse<String> response = client.send(requestClient, BodyHandlers.ofString());

            if (response.statusCode() != 200){
                throw new LLMException(response.body());
            }

            return new TextResponse(response.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new LLMException("gemini 서버와 통신을 실패했습니다.", e);
        }
    }
}
