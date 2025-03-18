package com.grepp.library.g_io.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// NOTE GC1 : InputStreamReader, OutputStreamWriter
// byte stream 을 문자기반 stream 으로 변경
public class C_StreamWR {

    public static void main(String[] args) {
        readFile();
//        writeFile();
    }

    private static void readFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어올 파일명을 작성 : ");
        String fileName = sc.nextLine();

        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))
        ) {
            StringBuffer sb = new StringBuffer();
            String line = "";

            while(line != null){
                sb.append(line).append("\n");
                line = reader.readLine();
            }

            System.out.println(sb);

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

        try(
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)))
        ) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
