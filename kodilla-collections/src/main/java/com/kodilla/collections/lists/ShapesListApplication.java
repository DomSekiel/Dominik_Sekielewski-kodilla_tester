package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {

    public static List<Square> getLargeSquares() {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10));
        shapes.add(new Square(5));
        shapes.add(new Square(1));

        List<Square> largeSquares = new ArrayList<>();

        for (Square square : shapes) {
            if (square.getArea() > 20) {
                largeSquares.add(square);
            }
        }

        return largeSquares;

    }

    public static void main(String[] args) {
        for (Square square : getLargeSquares()) {
                System.out.println(square + ", area:" + square.getArea());
        }
    }
}