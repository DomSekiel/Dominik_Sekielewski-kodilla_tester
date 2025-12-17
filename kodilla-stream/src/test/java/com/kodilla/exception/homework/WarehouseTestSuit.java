package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuit {

    @Test
    void shouldThrowExceptionWhenOrderDoesNotExist() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("ORDER1"));
        warehouse.addOrder(new Order("ORDER2"));
        warehouse.addOrder(new Order("ORDER3"));

        // when & then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("ORDER99"));
    }
}