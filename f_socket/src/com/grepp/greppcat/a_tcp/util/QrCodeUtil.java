package com.grepp.greppcat.a_tcp.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class QrCodeUtil {
    public static void createQrCode(String format, String content, OutputStream os){
        QRCodeWriter writer = new QRCodeWriter();
        try{
            BitMatrix matrix = writer.encode(content, BarcodeFormat.QR_CODE, 300, 300);
            MatrixToImageWriter.writeToStream(matrix, format, os);
        } catch (WriterException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}