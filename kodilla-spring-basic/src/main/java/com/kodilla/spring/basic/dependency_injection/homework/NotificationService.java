package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationService implements NotificationServiceInterface {

    @Override
    public void sendSuccess(String address, double weight) {
        System.out.println("Package delivered to: " + address + "\nWeight: " + weight);
    }

        @Override
        public void sendFail(String address,double weight){
            System.out.println("Package not delivered to: " + address  + "\nWeight: " + weight);
        }
    }