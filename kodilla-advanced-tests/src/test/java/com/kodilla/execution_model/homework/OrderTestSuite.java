package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {

    Order order = new Order(200.0, LocalDate.of(2024, 5, 10), "user123");
    Order secondOrder = new Order(200.0, LocalDate.of(2024, 5, 11), "user321");

    @Test
    public void shouldCreateCorrectOrder() {
        //When
        double value = order.getValue();
        LocalDate date = order.getOrderDate();
        String login = order.getLogin();

        //Then
        assertEquals(200.0, value);
        assertEquals(LocalDate.of(2024, 5, 10), date);
        assertEquals("user123", login);
    }

    @Test
    public void shouldCompareTwoSameOrders() {
        //When
        boolean result = order.equals(secondOrder);

        //Then
        assertEquals(true, result);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Reseting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}