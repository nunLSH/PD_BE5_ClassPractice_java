package com.grepp.greppcat.a_tcp;

import com.grepp.greppcat.a_tcp.domain.IndexController;
import com.grepp.greppcat.a_tcp.domain.QrCodeController;
import com.grepp.greppcat.a_tcp.servlet.ServletStorage;
import java.util.Map;

public class Run {

    public static void main(String[] args) {
        ServletStorage.init(
            Map.of(
                "/qrcode", new QrCodeController(),
                "/", new IndexController()
            ));
        new TcpServer(8989,160).start();
    }

}