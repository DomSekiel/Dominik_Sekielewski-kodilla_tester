package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/numbersForGamblingMachine.csv")
    void shouldThrowInvalidNumbersException(int n1, int n2, int n3, int n4, int n5, int n6) {

        // given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(n1);
        userNumbers.add(n2);
        userNumbers.add(n3);
        userNumbers.add(n4);
        userNumbers.add(n5);
        userNumbers.add(n6);

        // when & then
        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(userNumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/numbersForGamblingMachine.csv")
    void numberOfWinsShouldBeBetween0And6(int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = Set.of(n1, n2, n3, n4, n5, n6);

        int wins = gamblingMachine.howManyWins(userNumbers);

        assertTrue(wins >= 0 && wins <= 6, "Liczba trafień powinna być między 0 a 6");
    }
}