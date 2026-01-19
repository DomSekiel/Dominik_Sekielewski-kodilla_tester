package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryServiceInterface deliveryService; //= new DeliveryService();
    private NotificationServiceInterface notificationService; // = new NotificationService();

    public ShippingCenter(DeliveryServiceInterface deliveryService, NotificationServiceInterface notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

        public String sendPackage (String address, double weight){
            if (deliveryService.deliverPackage(address, weight)) {
                notificationService.sendSuccess(address, weight);
            } else {
                notificationService.sendFail(address, weight);
            }
            return address;
        }
    }