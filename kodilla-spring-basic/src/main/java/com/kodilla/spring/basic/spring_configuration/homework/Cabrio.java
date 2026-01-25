package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    private final boolean headlightsTurnedOff;

    public Cabrio(boolean headlightsTurnedOff) {
        this.headlightsTurnedOff = headlightsTurnedOff;
    }

    @Override
    public boolean isHeadlightsTurnedOff() {
        return headlightsTurnedOff;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}