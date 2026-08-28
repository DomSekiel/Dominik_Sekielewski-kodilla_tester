package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryServiceTestSuite {

    @Test
    void shouldDeliverPackageWhenWeightIsNotGreaterThanThirty() {
        // Given
        DeliveryService deliveryService = new DeliveryService();

        // When
        boolean result = deliveryService.deliverPackage(
                "Hill Street 11, New York",
                18.2
        );

        // Then
        assertTrue(result);
    }

    @Test
    void shouldNotDeliverPackageWhenWeightIsGreaterThanThirty() {
        // Given
        DeliveryService deliveryService = new DeliveryService();

        // When
        boolean result = deliveryService.deliverPackage(
                "Hill Street 11, New York",
                35.0
        );

        // Then
        assertFalse(result);
    }
}