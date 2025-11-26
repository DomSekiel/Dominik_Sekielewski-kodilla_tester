package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static void describeCar(Car car) {
        String name;

        if (car instanceof Ford) {
            name = "Ford";
        } else if (car instanceof Opel) {
            name = "Opel";
        } else if (car instanceof Skoda) {
            name = "Skoda";
        } else {
            name = "Nieznany samochod";
        }

        System.out.println("Auto : " + name);
        System.out.println("Predkosc : " + car.getSpeed());
    }
}