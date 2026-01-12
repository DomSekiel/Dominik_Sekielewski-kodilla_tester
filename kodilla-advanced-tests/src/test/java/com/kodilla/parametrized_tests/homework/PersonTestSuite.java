package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestSuite {

    static Stream<Arguments> providePersonData() {
        return Stream.of(
                Arguments.of(1.75, 50, "Underweight"),
                Arguments.of(1.80, 70, "Normal (healthy weight)"),
                Arguments.of(1.75, 90, "Overweight"),
                Arguments.of(1.60, 110, "Obese Class I (Moderately obese)"),
                Arguments.of(1.60, 140, "Obese Class II (Severely obese)"),
                Arguments.of(1.60, 180, "Obese Class III (Very severely obese)"),
                Arguments.of(1.55, 200, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.50, 250, "Obese Class V (Super Obese)"),
                Arguments.of(1.50, 300, "Obese Class VI (Hyper Obese)")
        );
    }

    @ParameterizedTest
    @MethodSource("providePersonData")
    void shouldReturnCorrectBMIClassification(double height, double weight, String expectedBMIClassification) {

        Person person = new Person(height, weight);

        Assertions.assertEquals(expectedBMIClassification, person.getBMI());
    }
}