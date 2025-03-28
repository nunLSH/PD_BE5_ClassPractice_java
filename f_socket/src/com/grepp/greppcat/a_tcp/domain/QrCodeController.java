package com.grepp.greppcat.a_tcp.domain;

import com.grepp.greppcat.a_tcp.http.HttpHeader;
import com.grepp.greppcat.a_tcp.http.request.HttpRequest;
import com.grepp.greppcat.a_tcp.http.response.HttpResponse;
import com.grepp.greppcat.a_tcp.http.response.ResponseBody;
import com.grepp.greppcat.a_tcp.http.response.ResponseStartLine;
import com.grepp.greppcat.a_tcp.servlet.Servlet;
import com.grepp.greppcat.a_tcp.util.QrCodeUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class QrCodeController implements Servlet{

    public HttpResponse doGet(HttpRequest request) {

        String filename = request.param().get("name").getFirst();
        String content = request.param().get("content").getFirst();

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            QrCodeUtil.createQrCode("png", content, bos);

            return new HttpResponse(
                ResponseStartLine.OK,
                new HttpHeader(),
                new ResponseBody().addBody(bos.toByteArray())
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public HttpResponse doPost(HttpRequest request) {
        return null;
    }
}