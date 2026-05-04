package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource({"andrzej@andrzej.pl, true", "janusz.karol@gmail.com.pl, true", "eugeniusz@gov.pl, true", "jan@edmund, false", "karol@andrzej., false", "janusz.pl, false", "@krzysztof.emil, false"})
    void shouldValidateEmailsCorrectly(String email, boolean expected) {
        assertEquals(expected, validator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource({"'Jan_123', true", "'Jan.Kowalski', true", "'Jak-Kowalski', true", "'Jan123', true", "'JK', false", "'J', false", "'jk', false", "'Jan@Kowalski', false", "'Jan#Kowalski', false", "'', false"})
    void shouldReturnExpectedResultForUsernameValidation(String username, boolean expected) {
        assertEquals(expected, validator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnFalseForNullUsername(String username) {
        assertEquals(false, validator.validateUsername(username));
    }
}