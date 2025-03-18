package com.grepp.library.g_io.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class B_FileIO {
    // NOTE GB01
    // IO (input, output)
    // 입출력: 외부자원으로 부터 프로그램으로 데이터를 읽어오거나, 외부자원으로 데이터를 내보내는 것

    // NOTE GB02
    // Stream
    // 데이터가 오가는 단방향 통로, InputStream(입력), OutputStream(출력)
    // Stream은 사용이 끝나면 반드시 Stream을 닫아줘야 한다.

    // NOTE GB03 : Stream 구분
    // 1. Byte 기반 Stream (1byte 데이터를 수송신)
    // 2. 문자 기반 Stream (2byte 데이터를 수송신)

    // a. 기반 Stream : 실제 외부자원과 데이터를 입출력하는 Stream
    // b. 보조 Stream : 기반 Stream에 기능을 추가해주는 데코레이터
    //                  FilterStream을 상속 받는다.
    public static void main(String[] args) {
//        writeFile();
//        readFile();
        copyFile();
    }

    private static void copyFile() {
        String sourcePath = "/Users/imseohyeon/Desktop/Programmers/backend/a_java.zip";
        String outputPath = "./copy.zip";
        try(
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(outputPath);
        ){

            long start = System.currentTimeMillis();

            int data = 0;
            while((data = fis.read()) != -1) {
                fos.write(data);
            }

            long end = System.currentTimeMillis();
            System.out.println("no buffer : " + (end - start));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void readFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어올 파일명을 작성 : ");
        String fileName = sc.nextLine();

        try(FileInputStream fis = new FileInputStream(fileName)){
            byte[] bytes = fis.readAllBytes();
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
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

        // NOTE GB04
        // try with resource 문
        // try(AutoClosable 변수 선언) {} catch - finally
        try(FileOutputStream fos = new FileOutputStream(filename, true)) {
            fos.write(content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}