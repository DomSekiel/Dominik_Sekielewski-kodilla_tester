package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<Location, Set<User>> locationSubscribers = new HashMap<>();

    public void addSubscriber(User user, Location location) {
        Set<User> users = locationSubscribers.computeIfAbsent(location, k -> new HashSet<>());
        users.add(user);
    }

    public void removeSubscriber(User user, Location location) {
        if (locationSubscribers.containsKey(location)) {
            locationSubscribers.get(location).remove(user);
        }
    }

    public void removeAllSubscriptions(User user) {
        for (Set<User> users : locationSubscribers.values()) {
            users.remove(user);
        }
    }

    public void sendNotificationToLocation(String message, Location location) {
        if (locationSubscribers.containsKey(location)) {
            for (User user : locationSubscribers.get(location)) {
                user.receive(message);
            }
        }
    }

    public void sendNotificationToAll(String message) {
        Set<User> allUsers = new HashSet<>();

        for (Set<User> users : locationSubscribers.values()) {
            allUsers.addAll(users);
        }

        for (User user : allUsers) {
            user.receive(message);
        }
    }

    public void removeLocation(Location location) {
        locationSubscribers.remove(location);
    }
}