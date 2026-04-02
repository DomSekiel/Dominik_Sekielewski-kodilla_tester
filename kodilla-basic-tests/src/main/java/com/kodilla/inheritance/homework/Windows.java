package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem    {

    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn()    {
        super.turnOn();
        System.out.println("Witaj Windows");
    }

    @Override
    public void turnOff()   {
        super.turnOff();
        System.out.println("Zegnaj Windows");
    }

    @Override
    public void displayYearOfRelease()  {
        System.out.print("Windows -> ");
        super.displayYearOfRelease();
    }
}