package com.grepp.library.f_stream.b_stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import com.grepp.library.f_stream.z_domain.Exam;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {

    public static void main(String[] args) {
//        testStream();
//        testSort();
//        testFilter();
//        testMap();
//        testGroupBy();
//        testReduce();
        testForeach();
    }

    private static Consumer<String> testForeach() {
        List<Exam> exams = createList();
        // NOTE FB01 : 람다 내부에서 지역변수를 사용할 수 없음
        // 사용하려면 상수처럼 쓸 수 있도록 추가적인 조치가 필요함.
        exams.forEach(System.out::println);
        int num = 0;
        Consumer<String> res = e -> System.out.println(e + ": " + num );
        return res;
    }

    private static void testReduce() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().reduce(0,
            (a, b) -> a + b,
            (a, b) -> a + b);
        
        System.out.println(sum);
//        practiceReduceToFilter(createList());
//        practiceReduceToMap(createList());
    }

    // exams 에서 학생 이름을 추출해, Set으로 반환하는 reduce를 작성하시오.
    // [어선정, 허명도]
    private static void practiceReduceToMap(List<Exam> list) {
        Set<String> nameSet = list.stream()
                .reduce(new LinkedHashSet<>(),
                    (a, b) -> {
                        a.add(b.name());
                        return a;
                    },
                    (a, b) -> null);

        System.out.println(nameSet);
    }

    private static void practiceReduceToFilter(List<Exam> list) {
        List<Exam> filtered = list.stream()
            .reduce(new ArrayList<Exam>(),
                (result,exam) -> {
                    if (exam.score() <= 70){
                        result.add(exam);
                    }
                    return result;
                },
                (a,b) -> null);

        System.out.println("=== practiceReduceToFilter ===");
        System.out.println(filtered);
    }

    private static void testGroupBy() {
        List<Exam> exams = createList();
        Map<String, Double> grouped = exams.stream()
            .collect(Collectors.groupingBy(e -> e.name(),
                Collectors.averagingInt(e -> e.score())));

        System.out.println(grouped);
    }

    private static void testMap() {
        List<Exam> exams = createList();

        // exams에서 학생들의 시험 과목만 추출
//        List<String> list = exams.stream().map(e -> e.subject()).toList();
//        System.out.println(list);

        // 과목명에 '어'가 포함되는 시험과목만 추출
        List<String> list = exams.stream()
            .map(e -> e.subject())
            .filter(e -> e.contains("어"))
            .toList();

        // 시험을 본 학생들의 성만 추출해서 출력해주세요.
        // [하, 어, 어, 하]
        list = exams.stream()
            .map(e -> e.name().substring(0,1))
            .toList();
        System.out.println(list);

        // 성의 종류를 추출 (중복 x)
        Set<String> set = exams.stream()
            .map(e -> e.name().substring(0,1))
            .collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void testFilter() {
        List<Exam> exams = createList();
        // 점수가 70점 이하인 시험 출력
        System.out.println("==== filter ====");
        List<Exam> list = exams.stream().filter(e -> e.score() <= 70).toList();
        System.out.println(list);

        // 어선정님의 시험 성적만 출력
        System.out.println("==== 어선정님의 성적만 출력 ====");
        list = exams.stream().filter(e -> e.name().equals("어선정")).toList();
        System.out.println(list);
    }

    private static void testSort() {
        List<Exam> list = createList();
        list = list.stream()
            .sorted((a,b) -> a.score() - b.score()).toList();

        System.out.println(list);
    }

    private static void testStream() {
        // NOTE FB01 Stream
        // 1. Stream 생성
        Stream<Integer> iStream = Stream
            .<Integer>builder()
            .add(10).add(13).add(324).add(27)
            .build();

        List<Integer> list = iStream
            .sorted((a,b) -> -(a-b))  // 2. 중간 연산, 내림차순 정렬
            .toList(); // 3. 결과 연산

        System.out.println(list);

    }

    private static List<Exam> createList() {
        List<Exam> list = new ArrayList<>();
        list.add(new Exam("국어", "하명도", 90));
        list.add(new Exam("수학", "어선정", 100));
        list.add(new Exam("영어", "어선정", 100));
        list.add(new Exam("과학", "하명도", 46));
        return list;
    }

}
