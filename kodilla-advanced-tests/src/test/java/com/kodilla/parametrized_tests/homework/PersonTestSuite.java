package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestSuite {

    static Stream<Arguments> providePersonData() {
        return Stream.of(
                // very low BMI
                Arguments.of(1.70, 40, "Very severely underweight"),
                Arguments.of(1.70, 45, "Severely underweight"),

                // edge cases
                Arguments.of(1.75, 56.7, "Normal (healthy weight)"), // 18,5142
                Arguments.of(1.75, 76.6, "Overweight"), // 25,0122
                Arguments.of(1.75, 91.9, "Obese Class I (Moderately obese)"), // 30,0081

                // high BMI
                Arguments.of(1.50, 300, "Obese Class VI (Hyper Obese)"),

                // other
                Arguments.of(1.75, 50, "Underweight"),
                Arguments.of(1.80, 70, "Normal (healthy weight)"),
                Arguments.of(1.75, 90, "Overweight")
        );
    }

    @ParameterizedTest
    @MethodSource("providePersonData")
    void shouldReturnCorrectBMIClassification(double height, double weight, String expectedBMIClassification) {

        Person person = new Person(height, weight);

        Assertions.assertEquals(expectedBMIClassification, person.getBMI());
    }
}