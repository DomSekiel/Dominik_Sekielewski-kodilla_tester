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

    @Test
    void shouldProcessDog() {
        // Given
        Dog dog = new Dog();
        AnimalProcessor processor = new AnimalProcessor();

        // When
        processor.process(dog);

        // Then
        Assertions.assertEquals(4, dog.getNumberOfLegs());
    }

    @Test
    void shouldProcessDuck() {
        // Given
        Duck duck = new Duck();
        AnimalProcessor processor = new AnimalProcessor();

        // When
        processor.process(duck);

        // Then
        Assertions.assertEquals(2, duck.getNumberOfLegs());
    }
}