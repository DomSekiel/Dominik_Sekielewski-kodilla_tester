package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem opSys = new OperatingSystem(1954);
        opSys.turnOn();
        opSys.turnOff();
        opSys.displayYearOfRelease();

        Windows win = new Windows(2025);
        win.turnOn();
        win.turnOff();
        win.displayYearOfRelease();

        Linux lin = new Linux(2025);
        lin.turnOn();
        lin.turnOff();
        lin.displayYearOfRelease();
    }
}