package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTestSuite {
    @Test
    void shouldReturnDogNumberOfLegs() {
        // Given
        Dog dog = new Dog();

        // When
        int numberOfLegs = dog.getNumberOfLegs();

        // Then
        Assertions.assertEquals(4, numberOfLegs);
    }

    @Test
    void shouldReturnDuckNumberOfLegs() {
        // Given
        Duck duck = new Duck();

        // When
        int numberOfLegs = duck.getNumberOfLegs();

        // Then
        Assertions.assertEquals(2, numberOfLegs);
    }
}