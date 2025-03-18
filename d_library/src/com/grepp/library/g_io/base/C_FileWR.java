package com.grepp.library.g_io.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class C_FileWR {

    public static void main(String[] args) {
//        writeFile();
        readFile();
    }

    private static void readFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어올 파일명을 작성 : ");
        String fileName = sc.nextLine();

        try(FileReader reader = new FileReader(fileName)){
            int data = 0;
            StringBuffer sb = new StringBuffer();

            while((data = reader.read()) != -1) {
                sb.append((char)data);
            }

            System.out.println(sb.toString());
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
        try(FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}