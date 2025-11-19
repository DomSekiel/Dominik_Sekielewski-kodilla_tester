package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(10);

        System.out.println("Circle");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        System.out.println("Square");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}