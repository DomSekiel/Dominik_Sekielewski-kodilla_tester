package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import java.util.List;

public class ForumStats {

    static double averagePostsAboveOrEqual40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40) //bez filtra wywala te samą średnią dla obu grup wiekowych
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .orElse(0);
    }

    static double averagePostsBelow40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {

        List<User> users = com.kodilla.stream.UsersRepository.getUserList();

        double avgAbove = averagePostsAboveOrEqual40(users);
        double avgBelow = averagePostsBelow40(users);

        System.out.println("Srednia liczba postow dla Userow w wieku >= 40 lat to: " + avgAbove);
        System.out.println("Srednia liczba postow dla Userow w wieku < 40 lat to: " + avgBelow);
    }
}