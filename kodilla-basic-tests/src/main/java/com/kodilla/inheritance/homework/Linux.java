package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Witaj Linux");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Zegnaj Linux");
    }

    @Override
    public void displayYearOfRelease()  {
        System.out.print("Linux -> ");
        super.displayYearOfRelease();
    }
}