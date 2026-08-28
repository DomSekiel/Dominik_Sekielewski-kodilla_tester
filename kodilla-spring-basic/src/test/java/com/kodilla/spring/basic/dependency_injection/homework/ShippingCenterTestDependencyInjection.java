package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTestDependencyInjection {

    @Test
    void shouldSendPackage() {
        // Given
        DeliveryServiceInterface deliveryService =
                (address, weight) -> true;

        NotificationServiceInterface notificationService =
                new NotificationServiceInterface() {
                    @Override
                    public void sendSuccess(String address, double weight) {
                    }

                    @Override
                    public void sendFail(String address, double weight) {
                    }
                };

        ShippingCenter shippingCenter =
                new ShippingCenter(
                        deliveryService,
                        notificationService
                );

        // When
        String result = shippingCenter.sendPackage(
                "Hill Street 11, New York",
                18.2
        );

        // Then
        assertEquals(
                "Hill Street 11, New York",
                result
        );
    }
}