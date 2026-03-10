package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {
    WeatherNotificationService service = new WeatherNotificationService();

    User user = Mockito.mock(User.class);
    User secondUser = Mockito.mock(User.class);

    Location torun = new Location("Torun");
    Location bydgoszcz = new Location("Bydgoszcz");

    @Test
    public void subscribedUserShouldReceiveNotification() {

        service.addSubscriber(user, torun);

        service.sendNotificationToLocation("Storm", torun);

        Mockito.verify(user).receive("Storm");
    }

    @Test
    public void unsubscribedUserShouldNotReceiveNotification() {

        service.addSubscriber(user, torun);
        service.removeSubscriber(user, torun);

        service.sendNotificationToLocation("Storm", torun);

        Mockito.verify(user, Mockito.never()).receive("Storm");
    }

    @Test
    public void notificationShouldBeSentToAllUsersInLocation() {

        service.addSubscriber(user, torun);
        service.addSubscriber(secondUser, torun);

        service.sendNotificationToLocation("Storm", torun);

        Mockito.verify(user).receive("Storm");
        Mockito.verify(secondUser).receive("Storm");
    }

    @Test
    public void notificationShouldBeSentToAllUsers() {

        service.addSubscriber(user, torun);
        service.addSubscriber(secondUser, bydgoszcz);

        service.sendNotificationToAll("Regulation change");

        Mockito.verify(user).receive("Regulation change");
        Mockito.verify(secondUser).receive("Regulation change");
    }

    @Test
    public void userShouldReceiveOnlyOneNotificationWhenSubscribedMultipleTimes() {

        service.addSubscriber(user, torun);
        service.addSubscriber(user, torun);

        service.sendNotificationToLocation("Storm", torun);

        Mockito.verify(user, Mockito.times(1)).receive("Storm");
    }

    @Test
    public void userRemovedFromAllLocationsShouldNotReceiveNotification() {

        service.addSubscriber(user, torun);
        service.addSubscriber(user, bydgoszcz);

        service.removeAllSubscriptions(user);

        service.sendNotificationToAll("Storm");

        Mockito.verify(user, Mockito.never()).receive("Storm");
    }

    @Test
    public void removedLocationShouldNotSendNotifications() {

        service.addSubscriber(user, torun);

        service.removeLocation(torun);

        service.sendNotificationToLocation("Storm", torun);

        Mockito.verify(user, Mockito.never()).receive("Storm");
    }
}