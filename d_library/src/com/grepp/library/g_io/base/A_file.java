package com.grepp.library.g_io.base;

import java.io.File;
import java.io.IOException;

public class A_file {

    public static void main(String[] args) {

        try{
            File file = new File("/Users/imseohyeon/Desktop/Programmers/backend/a_java/d_library/text.txt");
            file.createNewFile();

            // NOTE GA01 : 경로
            // 절대 경로 : root 부터 경로를 지정하는 방식
            // 상대 경로 : 현재 위치부터 경로를 지정하는 방식
            //            현재위치 : ./, 또는 생략
            //                       ./a/b/c == a/b/c
            //            상위경로 : ../
            String path = "/Users/imseohyeon/Desktop/Programmers/backend/a_java/study/";
            File dirs = new File(path);
            System.out.println(dirs.mkdirs());

            File dirs2 = new File("./상대경로.txt");
            dirs2.createNewFile();

            dirs2 = new File("../../선조경로.txt");
            dirs2.createNewFile();

            dirs2 = new File("./src/src.text");
            dirs2.createNewFile();

            path = "../../mkdirs/";
            dirs2 = new File(path + "a/");
            dirs2.mkdirs();

            dirs2 = new File(path + "b/");
            dirs2.mkdirs();

            dirs2 = new File(path + "c/");
            dirs2.mkdirs();

            dirs2 = new File(path + "a/a.txt");
            dirs2.createNewFile();

            dirs2 = new File(path + "b/b.txt");
            dirs2.createNewFile();

            File pathFile = new File(path + "c/");

            // NOTE GA02 : 경로 확인 후 파일 생성
            if(!pathFile.exists()){
                pathFile.mkdirs();
            }

            dirs2 = new File(path + "c/c.txt");
            dirs2.createNewFile();


        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}