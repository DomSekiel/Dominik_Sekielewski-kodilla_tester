package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstExampleTestSuite {

    @Test
    void shouldThrowExceptionWhenLastnameDoesNotExist() {
        // When & Then
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> FirstExample.main(new String[]{})
        );
    }
}