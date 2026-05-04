package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car skoda = new Skoda();
        Car ford = new Ford();
        Car opel = new Opel();

        cars.add(skoda);
        cars.add(ford);
        cars.add(opel);

        System.out.println("List before remove car:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(skoda);

        System.out.println("List after remove car:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
            CarRace.doRace(car);
        }

        System.out.println("Car list size: " + cars.size());
    }
}