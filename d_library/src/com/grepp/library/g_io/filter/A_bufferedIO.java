package com.grepp.library.g_io.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A_bufferedIO {

    public static void main(String[] args) {
        copyFile();
    }

    private static void copyFile() {
        String sourcePath = "/Users/imseohyeon/Desktop/Programmers/backend/a_java.zip";
        String outputPath = "./copy.zip";
        try(
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputPath));
        ){

            long start = System.currentTimeMillis();

            int data = 0;
            while((data = bis.read()) != -1) {
                bos.write(data);
            }

            long end = System.currentTimeMillis();
            System.out.println("no buffer : " + (end - start));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}