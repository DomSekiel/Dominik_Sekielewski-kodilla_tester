package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    //@Test
    //public void testSum() {
    //    Calculator calculator = new Calculator();
    //    int a = 5;
    //    int b = 8;
    //    int sumResult = calculator.sum(a, b);
    //    assertEquals(13, sumResult);
    //}
    @Test
    void metodaOdejmowania() {
        CalculatorPrime calculator = new CalculatorPrime();
        int result = calculator.subtract(5, 8);
        assertEquals(-3, result);
    }

    @Test
    void kwadratLiczbaDodatnia() {
        CalculatorPrime calculator = new CalculatorPrime();
        double actual = calculator.square(4);
        assertEquals(16.0, actual, 0.001);
    }

    @Test
    void kwadratZero() {
        CalculatorPrime calculator = new CalculatorPrime();
        double actual = calculator.square(0);
        assertEquals(0.0, actual , 0.001);
    }

    @Test
    void kwadratLiczbaUjemna() {
        CalculatorPrime calculator = new CalculatorPrime();
        double actual = calculator.square(-3);
        assertEquals(9.0, actual, 0.001);
    }
}