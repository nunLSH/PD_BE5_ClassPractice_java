package com.grepp.library.c_collection.z_domain;

import java.util.List;

public class SchoolFactory {

    public static List<School> createSchools(){
        School grepp = new School("그랩", "삼성", 10);
        School seoul = new School("서울대", "관악구", 4);
        School yeonsei = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School semyoung = new School("세명초", "속초", 1);

        return List.of(
            seoul, yeonsei, minsa, grepp, semyoung
        );
    }

}
