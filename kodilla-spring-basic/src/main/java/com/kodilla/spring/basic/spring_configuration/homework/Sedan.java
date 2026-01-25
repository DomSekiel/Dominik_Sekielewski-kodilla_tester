package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    private final boolean headlightsTurnedOff;

    public Sedan(boolean headlightsTurnedOff) {
        this.headlightsTurnedOff = headlightsTurnedOff;
    }

    @Override
    public boolean isHeadlightsTurnedOff() {
        return headlightsTurnedOff;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}