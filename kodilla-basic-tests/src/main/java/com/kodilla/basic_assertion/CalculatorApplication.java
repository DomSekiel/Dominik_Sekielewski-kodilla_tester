package com.kodilla.basic_assertion;

public class CalculatorApplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 5;
        int b = 8;
        int c = 4;

        int sumResult = calculator.sum(a, b);
        int substractResult = calculator.subtract(a, b);
        int squareResult = calculator.square(c);

        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie dziala poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSubstract = ResultChecker.assertEquals(-3, substractResult);
        if (correctSubstract) {
            System.out.println("Metoda odejmowania dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie dziala poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSquare = ResultChecker.assertEquals(16, squareResult);
        if (correctSquare) {
            System.out.println("Metoda potegowania dziala poprawnie dla liczby " + c);
            System.out.println("Kwadrat liczby " + c + " to: " + squareResult);
        } else {
            System.out.println("Metoda potegowania nie dziala poprawnie dla liczby " + c);
            System.out.println("Kwadrat liczby " + c + " to: " + squareResult);
        }
    }
}