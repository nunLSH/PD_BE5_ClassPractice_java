package com.grepp.library.c_collection.b_list;

import com.grepp.library.c_collection.b_list.grepp._ArrayList;
import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.b_list.grepp._List;
import com.grepp.library.c_collection.z_domain.School;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        // NOTE CB01 : CRUD
        // 데이터를 조작하는 방법
        // Create, Read, Update, Delete
//        pracAdd();
//        pracGet();
//        pracSet();
//        pracRemove();
//        pracSort();
        pracIterable();
    }

    private static void pracIterable() {
        _LinkedList<Integer> list = new _LinkedList<>();
//        list = new _ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

        for (Integer i : list){
            System.out.println(i);
        }
    }

    private static void pracSort() {
        School seoul = new School("서울대", "관악구", 4);
        School yeonsei = new School("연세대", "신촌", 4);
        School grepp = new School("그랩", "삼성", 10);
        School minsa = new School("민사고", "대전", 3);
        School semyoung = new School("세명초", "속초", 1);

        List<School> schools = new ArrayList<>(List.of(seoul, yeonsei, grepp, minsa, semyoung));
        List<Integer> nums = new ArrayList<>(List.of(13, 24,65, 3, 254, 45, 11));

        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(schools);
        System.out.println(schools);
    }

    private static void pracRemove() {
        _ArrayList<Integer> list = new _ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        int a = list.remove(2);
        System.out.println("삭제된 요소: " + a);

        for (int i = 0; i < 9; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void pracSet() {
        School grepp = new School("그랩", "삼성", 10);
        School seoul = new School("서울대", "관악구", 4);
        School yeonsei = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School semyoung = new School("세명초", "속초", 1);

        _ArrayList<School> list = new _ArrayList<>();
        list.add(seoul);
        list.add(yeonsei);
        System.out.println(list.get(0));

        list.set(0, grepp);
        System.out.println(list.get(0));
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

    private static void pracAdd(){
        _ArrayList<Integer> list = new _ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        list.add(2, 11);

        for (int i = 0; i < 11; i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n==========================");
    }

}
