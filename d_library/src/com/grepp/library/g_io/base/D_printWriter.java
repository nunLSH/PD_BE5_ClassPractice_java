package com.grepp.library.g_io.base;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class D_printWriter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일명 : ");
        String filename = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();

        try(PrintWriter pw = new PrintWriter(filename)) {
            pw.println(content);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

}
