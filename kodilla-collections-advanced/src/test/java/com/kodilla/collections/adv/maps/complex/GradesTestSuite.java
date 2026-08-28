package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    void shouldCalculateAverage() {
        // Given
        Grades grades = new Grades(
                Arrays.asList(5.0, 4.0, 3.0)
        );

        // When
        double average = grades.getAverage();

        // Then
        assertEquals(4.0, average);
    }

    @Test
    void shouldReturnZeroForEmptyGrades() {
        // Given
        Grades grades = new Grades(
                Collections.emptyList()
        );

        // When
        double average = grades.getAverage();

        // Then
        assertEquals(0.0, average);
    }
}