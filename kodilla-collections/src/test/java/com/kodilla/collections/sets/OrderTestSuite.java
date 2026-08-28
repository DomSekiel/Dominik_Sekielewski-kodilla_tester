package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderTestSuite {

    @Test
    void shouldReturnOrderData() {
        // Given
        Order order = new Order(
                "1/2026",
                "Mobile phone",
                1.0
        );

        // When
        String orderNumber = order.getOrderNumber();
        String productName = order.getProductName();
        double quantity = order.getQuantity();

        // Then
        assertEquals("1/2026", orderNumber);
        assertEquals("Mobile phone", productName);
        assertEquals(1.0, quantity);
    }

    @Test
    void shouldCompareOrders() {
        // Given
        Order order1 = new Order(
                "1/2026",
                "Mobile phone",
                1.0
        );

        Order order2 = new Order(
                "1/2026",
                "Mobile phone",
                1.0
        );

        // When
        boolean result = order1.equals(order2);

        // Then
        assertTrue(result);
        assertEquals(
                order1.hashCode(),
                order2.hashCode()
        );
    }

}