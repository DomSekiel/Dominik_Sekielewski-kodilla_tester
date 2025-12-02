package com.kodilla.collections.adv.immutable.homework;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Kodilla Bootcamp", 4);

        System.out.println("Nazwa szkolenia: " + task.title());
        System.out.println("Czas trwania: " + task.duration() + " miesiace");
    }
}