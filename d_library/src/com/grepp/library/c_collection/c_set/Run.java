package com.grepp.library.c_collection.c_set;

import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.c_set.grepp._HashSet_p1;
import com.grepp.library.c_collection.c_set.grepp._HashSet_p2;
import com.grepp.library.c_collection.c_set.grepp._HastSet_p3;
import com.grepp.library.c_collection.z_domain.School;
import com.grepp.library.c_collection.z_domain.SchoolFactory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run {

    public static void main(String[] args) {

//        pracAdd();
        pracRemove();
//        pracIterable();


//        List<String> firstList = List.of(
//            "임서현",
//            "김예원",
//            "박현도",
//            "김준형",
//            "안준희"
//        );
//        List<String> secondList = List.of(
//            "지지",
//            "쿠마",
//            "멘델",
//            "김예원",
//            "키아라"
//        );
//        Set<String> firstSet = new HashSet<>(firstList);
//        Set<String> secondSet = new HashSet<>(secondList);
//        pracSetOperation(firstSet, secondSet);
    }

    private static void pracIterable() {
        _HastSet_p3<Integer> list = new _HastSet_p3<>();
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

    private static void pracSetOperation(Set<String> firstSet, Set<String> secondSet) {

        // NOTE CC01. 합집합
        Set<String> setAll = new HashSet<>();
        setAll.addAll(firstSet);
        setAll.addAll(secondSet);
        System.out.println("===합집합===");
        System.out.println(setAll);

        // NOTE CC02. 차집합
        System.out.println("===차집합===");
        setAll.removeAll(secondSet);
        System.out.println(setAll);

        // NOTE CC03. 교집합
        System.out.println("===교집합===");
        firstSet.retainAll(secondSet);
        System.out.println(firstSet);

        // NOTE CC04. 부분집합 여부
        System.out.println("===부분집합 여부===");
        System.out.println(secondSet.containsAll(firstSet));
    }

    private static void pracRemove() {
        List<School> list = SchoolFactory.createSchools();
        _HastSet_p3<School> set = new _HastSet_p3<>();

        for(School school : list){
            set.add(school);
        }

        System.out.println(set);
        set.remove(new School("민사고", "대전", 3));

        for (int i = 0; i < 4; i++) {
            System.out.print(set.get(i) + " ");
        }
    }

    private static void pracAdd() {
        _HastSet_p3<School> set = new _HastSet_p3<>();
        List<School> list = SchoolFactory.createSchools();

        for (School school : list){
            System.out.println(school);
            System.out.println(set.add(school));
        }

        System.out.println(set);
    }

}
