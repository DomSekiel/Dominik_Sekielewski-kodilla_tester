package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car ford = new Ford();
        Car opel = new Opel();
        Car skoda = new Skoda();

        System.out.println("Ford:");
        doRace(ford);

        System.out.println("Opel:");
        doRace(opel);

        System.out.println("Skoda:");
        doRace(skoda);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Predkosc na wyscigu: " + car.getSpeed());
    }
}