package com.grepp.library.g_io.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B_bufferedWR {

    public static void main(String[] args) {
//        writeFile();
        readFile();
    }

    private static void readFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽어올 파일명을 작성 : ");
        String fileName = sc.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
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

        // NOTE GB04
        // try with resource 문
        // try(AutoClosable 변수 선언) {} catch - finally
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}