package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {

        Job szefKuchniJob = new SzefKuchni(6000, "Zarządzanie kuchnią w lokalu gastronomicznym");
        Job kucharzJob = new Kucharz(5000);
        Job kelnerJob = new Kelner(4000);

        Person szefKuchni = new Person("Adam", 45, szefKuchniJob);
        Person kucharz = new Person("Jan", 30, kucharzJob);
        Person kelner = new Person("Tomasz", 23, kelnerJob);

        szefKuchni.showResponsibilities();
        kucharz.showResponsibilities();
        kelner.showResponsibilities();
    }
}