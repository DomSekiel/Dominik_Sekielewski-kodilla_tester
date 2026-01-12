package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(100.0, LocalDate.of(2024,5,10), "user123");
    Order order2 = new Order(230.0, LocalDate.of(2024,5,11), "user321");
    Order order3 = new Order(180.0, LocalDate.of(2024,5,12), "user231");

    @Test
    public void shouldAddNewOrder() {
        //When
        int numberOfOrders = shop.getOrdersCount();

        //Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldReturnCorrectNumberOfOrders() {
        //When
        int numberOfOrders = shop.getOrdersCount();

        //Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldSumValuesOfAllOrders() {
        //When
        double sum = shop.getTotalOrdersValue();

        //Then
        assertEquals(400.0, sum);
    }

    @BeforeEach
    public void initializeShop() {

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
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