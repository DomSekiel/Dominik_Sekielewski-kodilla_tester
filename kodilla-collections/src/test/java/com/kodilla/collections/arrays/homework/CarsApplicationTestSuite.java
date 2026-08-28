package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsApplicationTestSuite {

    @Test
    void shouldDrawCar() {
        // When
        Car car = CarsApplication.drawCar();

        // Then
        assertNotNull(car);
        assertTrue(car.getSpeed() >= 0);
    }
}