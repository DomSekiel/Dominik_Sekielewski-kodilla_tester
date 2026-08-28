package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageAgeTestSuite {

    @Test
    void shouldCalculateAverageAge() {
        // Given
        double expectedAverage = 43.166666666666664;

        // When
        double result = AverageAge.calculateAverageAge();

        // Then
        assertEquals(expectedAverage, result, 0.001);
    }
}