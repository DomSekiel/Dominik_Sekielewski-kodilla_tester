package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {
        Person szefKuchni = new Person("Adam", 45, new SzefKuchni(6000));
        Person kucharz = new Person("Jan", 30, new Kucharz(5000) );
        Person kelner = new Person("Tomasz", 23, new Kelner (4000));

        szefKuchni.showResponsibilities();
        kucharz.showResponsibilities();
        kelner.showResponsibilities();
    }
}