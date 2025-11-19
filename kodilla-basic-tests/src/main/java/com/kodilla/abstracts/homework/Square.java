package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * width;
    }

    @Override
    public double perimeter() {
        return 4 * width;
    }
}