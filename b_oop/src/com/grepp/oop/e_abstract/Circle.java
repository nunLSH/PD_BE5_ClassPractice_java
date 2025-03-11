package com.grepp.oop.e_abstract;

public class Circle extends Figure{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
