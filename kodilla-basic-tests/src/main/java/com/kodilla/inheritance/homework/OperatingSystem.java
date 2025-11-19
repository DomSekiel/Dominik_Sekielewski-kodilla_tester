package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void turnOn()    {
        System.out.println("System zostal uruchomiony.");
    }
    public void turnOff()   {
        System.out.println("System zostal zamkniety");
    }
    public void displayYearOfRelease()  {
        System.out.println("Rok wydania: " + releaseYear);
    }
}
