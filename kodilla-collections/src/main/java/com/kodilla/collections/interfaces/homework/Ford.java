package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=23;
    }

    @Override
    public void decreaseSpeed() {
        speed -=7;
    }
}