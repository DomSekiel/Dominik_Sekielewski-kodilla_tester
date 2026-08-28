package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StampTestSuite {

    @Test
    void shouldReturnStampWidthAndHeight() {
        // Given
        Stamp stamp = new Stamp(
                "Kwiaty polskie",
                4.00,
                5.00,
                true
        );

        // When
        String name = stamp.getStampName();
        double width = stamp.getStampWidth();
        double height = stamp.getStampHeight();
        boolean stamped = stamp.isStampedStamp();

        // Then
        assertEquals("Kwiaty polskie", name);
        assertEquals(4.00, width);
        assertEquals(5.00, height);
        assertTrue(stamped);
    }

    @Test
    void shouldRecognizeEqualStamps() {
        // Given
        Stamp stamp1 = new Stamp(
                "Kwiaty polskie",
                4.00,
                5.00,
                true
        );
        Stamp stamp2 = new Stamp(
                "Kwiaty polskie",
                4.00,
                5.00,
                true
        );

        // When
        boolean result = stamp1.equals(stamp2);

        // Then
        assertTrue(result);
        assertEquals(stamp1.hashCode(), stamp2.hashCode());
    }

    @Test
    void shouldRecognizeDifferentStamps() {
        // Given
        Stamp stamp1 = new Stamp(
                "Kwiaty polskie",
                4.00,
                5.00,
                true
        );
        Stamp stamp2 = new Stamp(
                "Poczet krolow polskich",
                3.50,
                4.25,
                false
        );

        // When
        boolean result = stamp1.equals(stamp2);

        // Then
        assertFalse(result);
    }
}