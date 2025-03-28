package com.grepp.greppcat;

import com.grepp.greppcat.domain.IndexController;
import com.grepp.greppcat.domain.QrCodeController;
import com.grepp.greppcat.servlet.ServletStorage;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        ServletStorage.init(
            List.of( new QrCodeController(),new IndexController()
            ));
        new TcpServer(8989,160).start();
    }

}
