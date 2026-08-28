package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTestSuite {

    @Test
    void shouldCalculateCircleAreaAndPerimeter() {
        // Given
        Circle circle = new Circle(5);

        // When
        double area = circle.area();
        double perimeter = circle.perimeter();

        // Then
        assertEquals(Math.PI * 25, area);
        assertEquals(2 * Math.PI * 5, perimeter);
    }

    @Test
    void shouldCalculateRectangleAreaAndPerimeter() {
        // Given
        Rectangle rectangle = new Rectangle(5, 10);

        // When
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        // Then
        assertEquals(50, area);
        assertEquals(30, perimeter);
    }

    @Test
    void shouldReturnRectangleDimensions() {
        // Given
        Rectangle rectangle = new Rectangle(5, 10);

        // When
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();

        // Then
        assertEquals(5, width);
        assertEquals(10, height);
    }

    @Test
    void shouldCalculateSquareAreaAndPerimeter() {
        // Given
        Square square = new Square(5);

        // When
        double area = square.area();
        double perimeter = square.perimeter();

        // Then
        assertEquals(25, area);
        assertEquals(20, perimeter);
    }
}