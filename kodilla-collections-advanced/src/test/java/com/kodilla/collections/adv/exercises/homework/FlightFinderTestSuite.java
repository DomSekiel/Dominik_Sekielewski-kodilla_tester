package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private FlightFinder flightFinder;

    @BeforeEach
    void setUp() {
        flightFinder = new FlightFinder();
    }

    @Test
    void shouldFindFlightsFromWarsaw() {
        // when
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");

        // then
        assertEquals(2, flightsFromWarsaw.size());
    }

    @Test
    void shouldFindFlightsToWarsaw() {
        // when
        List<Flight> flightsToWarsaw = flightFinder.findFlightsTo("Warsaw");

        // then
        assertEquals(2, flightsToWarsaw.size());
    }

    @Test
    void shouldReturnEmptyListWhenNoFlightsFromCity() {
        // when
        List<Flight> flights = flightFinder.findFlightsFrom("Tokyo");

        // then
        assertEquals(0, flights.size());
    }
}