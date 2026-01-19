package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Autowired
    ShippingCenter shippingCenter;

    @Test
    void shouldReturnMessageWhenPackageIsDelivered() {
        String address = "Hill Street 11, New York";
        double weight = 18.2;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package delivered to: " + address, result);
    }

    @Test
    void shouldReturnMessageWhenPackageIsTooHeavyAndNotDelivered() {
        String address = "Beverly Hills 90210, Los Angeles";
        double weight = 90;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package not delivered to: " + address, result);
    }
}