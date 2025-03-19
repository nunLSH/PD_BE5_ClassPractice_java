package com.grepp.mc.infra.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.grepp.mc.infra.error.CommonException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class QrCodeUtil {

    public static void createQrCode(String format, String content, FileOutputStream fos){
        QRCodeWriter writer = new QRCodeWriter();
        try {
            BitMatrix matrix = writer.encode(content, BarcodeFormat.QR_CODE, 300, 300);
            MatrixToImageWriter.writeToStream(matrix, format, fos);
        } catch (WriterException | IOException e) {
            throw new CommonException("QR CODE 생성에 실패했습니다", e);
        }
    }

}
