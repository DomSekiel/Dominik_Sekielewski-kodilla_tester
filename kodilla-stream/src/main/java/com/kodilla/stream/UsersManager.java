package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        //processUsersStream ();
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    //private static void processUsersStream ()   {
    public static List<String> filterChemistGroupUsernames()    {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                //.forEach(username -> System.out.println(username));
                .collect(Collectors.toList());

        return usernames;
    }
    public static String getUserName (User user)    {
        return user.getUsername ();
    }

    public static List<User> getUsersOlderThan(int age) {
        return UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }
    public static List<User> getMostActiveUsers(int minPosts) {
        return UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPosts() > minPosts)
                .collect(Collectors.toList());
    }
}