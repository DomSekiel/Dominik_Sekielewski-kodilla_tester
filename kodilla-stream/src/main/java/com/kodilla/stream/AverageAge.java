package com.kodilla.stream;

public class AverageAge {

    public static double calculateAverageAge()  {
        return UsersRepository.getUserList()
                .stream()
                .mapToInt(n-> n.getAge())
                .average()
                .orElse(0);
    }

    public static void main(String[] args)  {
        System.out.println(calculateAverageAge());
    }
}