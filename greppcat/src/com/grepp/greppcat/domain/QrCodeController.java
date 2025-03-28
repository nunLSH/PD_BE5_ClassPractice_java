package com.grepp.greppcat.domain;

import com.grepp.greppcat.http.HttpHeader;
import com.grepp.greppcat.http.HttpMethod;
import com.grepp.greppcat.http.request.HttpRequest;
import com.grepp.greppcat.http.response.HttpResponse;
import com.grepp.greppcat.http.response.ResponseBody;
import com.grepp.greppcat.http.response.ResponseStartLine;
import com.grepp.greppcat.servlet.Servlet;
import com.grepp.greppcat.servlet.annotation.EndPoint;
import com.grepp.greppcat.servlet.annotation.RequestMapping;
import com.grepp.greppcat.util.QrCodeUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RequestMapping(url = "/qrcode")
public class QrCodeController implements Servlet {

    @EndPoint(url = "/download", method = HttpMethod.GET)
    public HttpResponse get(HttpRequest request) {

        String filename = request.param().get("name").getFirst();
        String content = request.param().get("content").getFirst();

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            QrCodeUtil.createQrCode("png", content, bos);

            return new HttpResponse(
                ResponseStartLine.OK,
                new HttpHeader()
                    .add("Content-Disposition", "attachment; filename=" + filename),
                new ResponseBody().addBody(bos.toByteArray())
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}