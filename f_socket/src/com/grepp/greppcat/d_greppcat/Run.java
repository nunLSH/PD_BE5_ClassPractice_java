package com.grepp.greppcat.d_greppcat;

import com.grepp.greppcat.d_greppcat.domain.IndexController;
import com.grepp.greppcat.d_greppcat.domain.QrCodeController;
import com.grepp.greppcat.d_greppcat.servlet.ServletStorage;
import java.util.List;
import java.util.Map;

public class Run {

    public static void main(String[] args) {
        ServletStorage.init(
            List.of( new QrCodeController(),new IndexController()
            ));
        new TcpServer(8989,160).start();
    }
}