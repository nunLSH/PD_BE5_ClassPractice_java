package com.grepp.greppcat.c_reflection.domain;

import com.grepp.greppcat.c_reflection.annotation.EndPoint;

public class Rectangle extends Figure{

    private String name = "Rectangle";
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    @EndPoint(url = "/area")
    protected double calcArea() {
        return width * height;
    }

    private void info(){
        System.out.println("사각형 입니다.");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "name='" + name + '\'' +
            ", width=" + width +
            ", height=" + height +
            '}';
    }

    @Override
    public int compareTo(Figure o) {
        return (int) (this.calcArea() - o.calcArea());
    }
}
