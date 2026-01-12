package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private final Set<Order> orders = new HashSet<>();

    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(LocalDate from, LocalDate to) {
        return orders
                .stream()
                .filter(order -> !order.getOrderDate().isBefore(from) && !order.getOrderDate().isAfter(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersBetweenValues(double minValue, double maxValue) {
        return orders
                .stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public double getTotalOrdersValue() {
        return orders
                .stream()
                .mapToDouble(Order::getValue).sum();
    }
}