package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop;
    Order order1;
    Order order2;
    Order order3;

    @BeforeEach
    void setUp() {
        shop = new Shop();

        order1 = new Order(100.0, LocalDate.of(2024,5,10), "user123");
        order2 = new Order(230.0, LocalDate.of(2024,5,11), "user321");
        order3 = new Order(180.0, LocalDate.of(2024,5,12), "user231");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    void testAddOrder() {
        Order newOrder = new Order(150, LocalDate.of(2024, 5, 13), "1234");
        assertTrue(shop.addOrder(newOrder));
        assertEquals(4, shop.getOrdersCount());

        assertFalse(shop.addOrder(newOrder));
        assertEquals(4, shop.getOrdersCount());
    }

    @Test
    void testGetOrdersBetweenDates() {
        LocalDate from = LocalDate.of(2024, 5, 10);
        LocalDate to = LocalDate.of(2024,5 , 11);

        List<Order> result = shop.getOrdersBetweenDates(from, to);
        assertEquals(2, result.size());
        assertTrue(result.contains(order1));
        assertTrue(result.contains(order2));
    }

    @Test
    void testGetOrdersBetweenValues() {
        List<Order> result = shop.getOrdersBetweenValues(100, 300);
        assertEquals(3, result.size());
        assertTrue(result.contains(order1));
        assertTrue(result.contains(order2));
        assertTrue(result.contains(order3));
    }

    @Test
    void testGetOrdersCount() {
        assertEquals(3, shop.getOrdersCount());
    }

    @Test
    void testGetTotalOrdersValue() {
        assertEquals(510, shop.getTotalOrdersValue());
    }

    @Test
    void testGetOrdersBetweenDatesNoMatch() {
        LocalDate from = LocalDate.of(2025, 5, 10);
        LocalDate to = LocalDate.of(2025, 5, 11);

        List<Order> result = shop.getOrdersBetweenDates(from, to);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetOrdersBetweenValuesNoMatch() {
        List<Order> result = shop.getOrdersBetweenValues(500, 600);
        assertTrue(result.isEmpty());
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