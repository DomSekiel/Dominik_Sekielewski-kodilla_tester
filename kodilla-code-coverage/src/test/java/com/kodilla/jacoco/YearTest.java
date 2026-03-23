package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNot400() {

        Year year = new Year(1900);

        boolean isLeapYear = year.isLeap();

        assertFalse(year.isLeap());
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4ButNot100() {

        Year year = new Year(2024);

        boolean isLeapYear = year.isLeap();

        assertTrue(year.isLeap());
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {

        Year year = new Year(2025);

        boolean isLeapYear = year.isLeap();

        assertFalse(year.isLeap());
    }
}