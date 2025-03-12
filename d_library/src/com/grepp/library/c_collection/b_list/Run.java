package com.grepp.library.c_collection.b_list;

import com.grepp.library.c_collection.z_domain.School;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        // NOTE CB01 : CRUD
        // 데이터를 조작하는 방법
        // Create, Read, Update, Delete
//        pracAdd();
//        pracGet();
//        pracSet();
        pracRemove();
    }

    private static void pracRemove() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        // 0, 1, 2, 3 인덱스 삭제
//        List<Integer> sublist = list.subList(0,4);
//        list.removeAll(sublist);
//        System.out.println(list);
    }

    private static void pracSet() {
        School grepp = new School("그랩", "삼성", 10);
        School seoul = new School("서울대", "관악구", 4);
        School yeonsei = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School semyoung = new School("세명초", "속초", 1);

        List<School> list = new ArrayList<>();
        list.add(seoul);
        list.add(yeonsei);
        System.out.println(list);

        list.set(0, grepp);
        System.out.println(list);
    }

    private static void pracGet(){
        List<String> list = new ArrayList<>();
        list.add("안녕");
        list.add("hi");
        list.add("hello");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void pracAdd() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 30; i++){
            list.add(i);
        }

        System.out.println(list);
    }

}
