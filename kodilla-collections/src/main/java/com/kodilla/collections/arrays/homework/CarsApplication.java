package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {
        Random random = new Random();
        int type = random.nextInt(3);
        Car car; // dlaczego trzeba użyć

        if (type == 0) car = new Ford();
        else if (type == 1) car = new Opel();
        else car = new Skoda();
        int zwPredkosc = random.nextInt(4);
        for (int i = 0; i < zwPredkosc; i++) {
            car.increaseSpeed();
        }
        return car;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(15);
        Car[] cars = new Car[size];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        System.out.println("Lista aut");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}