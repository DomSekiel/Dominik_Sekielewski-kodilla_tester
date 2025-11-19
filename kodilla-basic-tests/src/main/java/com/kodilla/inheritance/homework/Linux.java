package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn() {
        System.out.println("System lin sie otwiera");
    }
    @Override
    public void turnOff() {
        System.out.println("System lin sie zamyka");
    }
}