package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTestSuite {

    @Test
    void shouldCalculateSquareAreaAndPerimeter() {
        // Given
        Square square = new Square(5.0);

        // When
        double area = square.getArea();
        double perimeter = square.getPerimeter();

        // Then
        assertEquals(25.0, area);
        assertEquals(20.0, perimeter);
    }

    @Test
    void shouldCalculateCircleAreaAndPerimeter() {
        // Given
        Circle circle = new Circle(2.0);

        // When
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        // Then
        assertEquals(Math.PI * 4, area);
        assertEquals(4 * Math.PI, perimeter);
    }

    @Test
    void shouldCalculateTriangleAreaAndPerimeter() {
        // Given
        Triangle triangle = new Triangle(6.0, 4.0, 7.211);

        // When
        double area = triangle.getArea();
        double perimeter = triangle.getPerimeter();

        // Then
        assertEquals(12.0, area);
        assertEquals(17.211, perimeter);
    }

    @Test
    void shouldCompareSquares() {
        // Given
        Square square1 = new Square(5.0);
        Square square2 = new Square(5.0);

        // When
        boolean result = square1.equals(square2);

        // Then
        assertTrue(result);
        assertEquals(square1.hashCode(), square2.hashCode());
    }

    @Test
    void shouldCompareCircles() {
        // Given
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(3.0);

        // When
        boolean result = circle1.equals(circle2);

        // Then
        assertTrue(result);
        assertEquals(circle1.hashCode(), circle2.hashCode());
    }

    @Test
    void shouldCompareTriangles() {
        // Given
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);

        // When
        boolean result = triangle1.equals(triangle2);

        // Then
        assertTrue(result);
        assertEquals(
                triangle1.hashCode(),
                triangle2.hashCode()
        );
    }
}