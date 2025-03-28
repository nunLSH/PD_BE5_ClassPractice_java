package com.grepp.greppcat.c_reflection;

import com.grepp.greppcat.c_reflection.annotation.EndPoint;
import com.grepp.greppcat.c_reflection.domain.Figure;
import com.grepp.greppcat.c_reflection.domain.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Run {

    // NOTE C01 Reflection
    // 클래스의 구성요소(member) 를 동적으로 분석하고 사용
    // 1. 클래스 선언부 (부모클래스, 구현 인터페이스)
    // 2. 필드 변수
    // 3. 메서드, 생성자

    public static void main(String[] args) {
        try {
//            createClass();
//            studyClassInfo();
            studyMethodInfo();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private static void studyMethodInfo()
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Rectangle> rectangleClass = Rectangle.class;

        Rectangle rectangle = rectangleClass.getDeclaredConstructor(int.class, int.class)
            .newInstance(100, 50);

        System.out.println("1. 메서드");
        Method[] methods = rectangleClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        System.out.println("\n2. 메서드 호출");
        for (Method method : methods){
            if(method.getName().equals("info")) {
                System.out.println("\ninfo method 호출");
                method.setAccessible(true);
                method.invoke(rectangle);
            }

            if(method.getName().equals("calcArea")) {
                System.out.println(Arrays.toString(method.getAnnotations()));
            }

            if(method.isAnnotationPresent(EndPoint.class)){
                System.out.println("\n3. EndPoint Annotation 이 선언된 메서드 호출");
                method.setAccessible(true);
                System.out.println("calcArea : " + method.invoke(rectangle));
            }
        }
    }

    private static void studyClassInfo()
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Rectangle> rectangleClass = Rectangle.class;
        Class<Figure> figureClass = Figure.class;

        System.out.println("1. class full name");
        System.out.println(rectangleClass.getCanonicalName());

        System.out.println("\n2. 생성자");
        System.out.println(Arrays.toString(rectangleClass.getDeclaredConstructors()));

        Rectangle rectangle = rectangleClass.
            getDeclaredConstructor(int.class, int.class)
            .newInstance(20, 10);

        System.out.println("\n3. 필드변수");
        Field field = rectangleClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("name" + field.get(rectangle));

        System.out.println("\n4. 부모클래스");
        System.out.println(rectangleClass.getSuperclass());
        System.out.println(figureClass.getSuperclass());

        System.out.println("\n5. 인터페이스");
        System.out.println(Arrays.toString(rectangleClass.getInterfaces()));
        System.out.println(Arrays.toString(figureClass.getInterfaces()));

    }

    private static void createClass() throws ClassNotFoundException {
        System.out.println("1. Type.class 로 Class class 호출");
        System.out.println(Rectangle.class);

        System.out.println("\n2. instance 로 Class 호출");
        System.out.println(new Rectangle(10, 10).getClass());

        System.out.println("\n3. Class.forName()");
        System.out.println(Class.forName("com.grepp.greppcat.c_reflection.domain.Rectangle"));
    }

}
