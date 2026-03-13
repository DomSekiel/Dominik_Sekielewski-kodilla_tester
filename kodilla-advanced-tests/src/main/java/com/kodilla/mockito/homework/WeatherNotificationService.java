package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private final Map<Location, Set<User>> locationSubscribers = new HashMap<>();

    public void addSubscriber(User user, Location location) {

        if (user == null || location == null) {
            throw new IllegalArgumentException("User and Location are null");
        }
        Set<User> users = locationSubscribers.computeIfAbsent(location, k -> new HashSet<>());
        users.add(user);
    }

    public void removeSubscriber(User user, Location location) {
        if (user == null || location == null) {
            throw new IllegalArgumentException("User and Location are null");
        }
        if (locationSubscribers.containsKey(location)) {
            locationSubscribers.get(location).remove(user);
        }
    }

    public void removeAllSubscriptions(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User is null");
        }
        for (Set<User> users : locationSubscribers.values()) {
            users.remove(user);
        }
    }

    public void sendNotificationToLocation(String message, Location location) {
        if (location == null) {
            throw new IllegalArgumentException("Location is null");
        }
        if (locationSubscribers.containsKey(location)) {
            for (User user : locationSubscribers.get(location)) {
                user.receive(message);
            }
        }
    }

    public void sendNotificationToAll(String message) { // zbiór Userów jest stworzony po to, aby każdy użytkownik otzymał wiadomość tylko raz (nawet jeżeli subskrybuje kilka lokalizacji)
        Set<User> allUsers = new HashSet<>();

        for (Set<User> users : locationSubscribers.values()) {
            allUsers.addAll(users);
        }

        for (User user : allUsers) {
            user.receive(message);
        }
    }

    public void removeLocation(Location location) {
        if (location == null) {
            throw new IllegalArgumentException("Location is null");
        }
        locationSubscribers.remove(location);
    }
}