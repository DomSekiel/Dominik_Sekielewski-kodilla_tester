package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapesListApplicationTestSuite {

    @Test
    void shouldReturnSquaresWithAreaGreaterThanTwenty() {
        // When
        List<Square> result = ShapesListApplication.getLargeSquares();

        // Then
        assertEquals(2, result.size());
        assertEquals(100.0, result.get(0).getArea());
        assertEquals(25.0, result.get(1).getArea());
    }
}