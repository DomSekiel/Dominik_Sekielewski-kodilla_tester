package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.Test;

class ShapeUtilsTestSuite {

    @Test
    void shouldDisplayCircleInfo() {
        // Given
        Circle circle = new Circle(2.0);

        // When
        ShapeUtils.displayShapeInfo(circle);

        // Then
    }

    @Test
    void shouldDisplaySquareInfo() {
        // Given
        Square square = new Square(3.0);

        // When
        ShapeUtils.displayShapeInfo(square);

        // Then
    }

    @Test
    void shouldDisplayTriangleInfo() {
        // Given
        Triangle triangle = new Triangle(
                3.0,
                4.0,
                5.0
        );

        // When
        ShapeUtils.displayShapeInfo(triangle);

        // Then
    }
}