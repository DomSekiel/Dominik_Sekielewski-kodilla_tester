package com.kodilla.abstracts.homework;

public class Square extends Rectangle {

    private double width;

    public Square(double width) {
        super(width, width);
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