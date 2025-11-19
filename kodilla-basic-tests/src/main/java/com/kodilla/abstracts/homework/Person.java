package com.kodilla.abstracts.homework;

import java.awt.*;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        System.out.println(firstName + " ma nastepujace obowiazki w pracy:");
        System.out.println(job.getResponsibilities());
    }
}
