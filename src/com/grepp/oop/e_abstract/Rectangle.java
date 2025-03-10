package com.grepp.oop.e_abstract;

public class Rectangle extends Figure{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
