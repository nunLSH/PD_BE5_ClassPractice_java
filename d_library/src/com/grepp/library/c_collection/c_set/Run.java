package com.grepp.library.c_collection.c_set;

import com.grepp.library.c_collection.z_domain.School;
import com.grepp.library.c_collection.z_domain.SchoolFactory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run {

    public static void main(String[] args) {

//        pracAdd();
//        pracRemove();
    }

    private static void pracRemove() {
        List<School> list = SchoolFactory.createSchools();
        Set<School> set = new HashSet<>(list);
        System.out.println(set);

        set.remove(new School("민사고", "대전", 3));
        System.out.println(set);
    }

    private static void pracAdd() {
        Set<School> set = new HashSet<>();
        List<School> list = SchoolFactory.createSchools();

//        for (School school : list){
//            set.add(school);
//        }
        set.addAll(list);
        System.out.println(set);

    }

}
