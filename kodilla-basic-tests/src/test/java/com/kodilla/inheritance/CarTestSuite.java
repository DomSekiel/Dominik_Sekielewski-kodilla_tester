package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTestSuite {

    @Test
    void shouldReturnNumberOfWheels() {
        // Given
        Car car = new Car(4, 5);

        // When
        int wheels = car.getWheels();

        // Then
        Assertions.assertEquals(4, wheels);
    }

    @Test
    void shouldReturnNumberOfSeats() {
        // Given
        Car car = new Car(4, 5);

        // When
        int seats = car.getSeats();

        // Then
        Assertions.assertEquals(5, seats);
    }
    @Test
    void shouldUseCarMethods() {
        // Given
        Car car = new Car(4, 5);

        // When
        car.turnOnLights();
        car.openDoors();
        car.displayNumberOfSeats();

        // Then
    }

    @Test
    void shouldUseConvertibleMethods() {
        // Given
        Convertible convertible = new Convertible(4, 2);

        // When
        convertible.openRoof();
        convertible.closeRoof();
        convertible.openDoors();

        // Then
    }
}