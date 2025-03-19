package com.grepp.mc.domain.qrcode;

import com.grepp.mc.domain.song.Song;
import com.grepp.mc.infra.util.QrCodeUtil;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class QrCodeGenerator {

    public void generate(Song song){
        String url = "https://nonoki.com/music/search/";
        String music = song.artist() + "-" + song.title();
        String encoded = URLEncoder.encode(music, StandardCharsets.UTF_8);
        String filename = music + ".png";
        String qrContent = url + encoded;

        System.out.println(qrContent);
        System.out.println(filename);

        try (FileOutputStream fos = new FileOutputStream(filename)) {
            QrCodeUtil.createQrCode("png", qrContent, fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
