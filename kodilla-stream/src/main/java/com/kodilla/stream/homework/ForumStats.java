package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double averagePostsAboveOrEqual40 = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40) //bez filtra wywala te samą średnią dla obu grup wiekowych
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .getAsDouble();

        double averagePostsBelow40 = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .getAsDouble();

        System.out.println("Srednia liczba postow dla Userow w wieku >= 40 lat to: " + averagePostsAboveOrEqual40);
        System.out.println("Srednia liczba postow dla Userow w wieku < 40 lat to: " + averagePostsBelow40);
    }
}