package com.grepp.greppcat.http.request;

import com.grepp.greppcat.http.HttpHeader;
import com.grepp.greppcat.http.HttpMethod;
import java.io.BufferedReader;
import java.io.IOException;

public class RequestParser {

    public HttpRequest parse(String line, BufferedReader reader) throws IOException {
        RequestStartLine startLine = parseStartLine(line);
        HttpHeader header = parseHttpHeader(reader);
        RequestParameter param = new RequestParameter();
        parseQueryString(startLine.queryString(), param);

        HttpMethod requestMethod = startLine.method();
        if(requestMethod.equals(HttpMethod.POST) || requestMethod.equals(HttpMethod.PUT)) {
            parseRequestBody(param, header, reader);
        }

        return new HttpRequest(startLine, header, param);
    }

    private HttpHeader parseHttpHeader(BufferedReader reader) throws IOException {
        HttpHeader header = new HttpHeader();

        String headerLine = reader.readLine();
        while(!headerLine.isEmpty()){
            header.add(headerLine);
            headerLine = reader.readLine();
        }

        return header;
    }

    private void parseQueryString(String queryString, RequestParameter param) {
        if (queryString.isEmpty())
            return;

        String[] paramTokens = queryString.split("&");
        for (String paramToken : paramTokens) {
            param.add(paramToken);
        }
    }

    private RequestStartLine parseStartLine(String line) {

        String[] tokens = line.split(" ");
        String method = tokens[0];
        String url = tokens[1];
        String version = tokens[2];
        String queryString = "";

        int queryIndex = url.indexOf("?");

        if(queryIndex == -1) return new RequestStartLine(
            HttpMethod.valueOf(method),
            url,
            queryString,
            version
        );

        url = tokens[1].substring(0, queryIndex);
        queryString = tokens[1].substring(queryIndex+1);

        return new RequestStartLine(
            HttpMethod.valueOf(method),
            url,
            queryString,
            version
        );
    }

    private void parseRequestBody(RequestParameter param, HttpHeader header, BufferedReader reader)
        throws IOException {

        int contentLength = Integer.parseInt(
            header.getHeader("Content-Length").getFirst().trim()
        );

        char[] bodyData = new char[contentLength];
        reader.read(bodyData, 0, contentLength);
        String bodyTxt = String.valueOf(bodyData);

        if (!bodyTxt.isEmpty()) {
            parseQueryString(bodyTxt, param);
        }
    }
}