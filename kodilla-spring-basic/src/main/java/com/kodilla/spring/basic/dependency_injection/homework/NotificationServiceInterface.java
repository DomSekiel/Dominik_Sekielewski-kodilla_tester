package com.kodilla.spring.basic.dependency_injection.homework;

public interface NotificationServiceInterface {
    void sendSuccess(String address, double weight);
    void sendFail(String address, double weight);
}