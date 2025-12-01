package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Skoda skoda = new Skoda();
        cars.add(skoda);
        cars.add(new Opel());
        cars.add(new Ford());

        cars.remove(1);
        cars.remove(skoda);

        System.out.println("Rozmiar listy: " + cars.size());

        for (Car car : cars)   {
            CarUtils.describeCar(car);
            CarRace.doRace(car);
        }
    }
}