package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {

        OperatingSystem win = new Windows(2025);
        OperatingSystem lin = new Linux(2026);

        win.turnOn();
        win.turnOff();
        win.displayYearOfRelease();

        System.out.println();

        lin.turnOn();
        lin.turnOff();
        lin.displayYearOfRelease();
    }
}