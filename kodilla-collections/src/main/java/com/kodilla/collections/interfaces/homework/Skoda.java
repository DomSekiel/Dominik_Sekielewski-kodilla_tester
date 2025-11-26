package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 7;
    }
}