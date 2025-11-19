package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem    {
    public Windows(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn()    {
        System.out.println("System win sie otwiera");
    }
    @Override
    public void turnOff()   {
        System.out.println("System win sie zamyka");
    }
}