package com.grepp.library.g_io.base;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// NOTE GE01 : ByteArrayIO
// 메모리 기반으로 데이터 처리
// 라이브러리가 반환해주는 데이터를
public class E_ByteArrayIO {

    public static void main(String[] args) {
        readFile();
//        writeFile();

    }

    private static void readFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어올 파일명을 작성 : ");
        String fileName = sc.nextLine();

        try (
            FileInputStream fis = new FileInputStream(fileName);
            ByteArrayInputStream bis = new ByteArrayInputStream(fis.readAllBytes());
        ) {
            System.out.println(new String(bis.readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        private static void writeFile() {
            Scanner sc = new Scanner(System.in);
            System.out.print("파일명 : ");
            String filename = sc.nextLine();
            System.out.print("내용 : ");
            String content = sc.nextLine();

            try (FileOutputStream fos = new FileOutputStream(filename, true);
                ByteArrayOutputStream bos = new ByteArrayOutputStream()
            ) {
                bos.write(content.getBytes(StandardCharsets.UTF_8));
                fos.write(bos.toByteArray());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
