package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationClassTestSuite {

    @Test
    public void shouldCreateCarBeanAndCheckType() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("car");

        String carType = car.getCarType();

        List<String> possibleCars = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(possibleCars.contains(carType));
    }

    @Test
    public void shouldCreateCarBeanAndCheckHeadlightsOff() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("car");

        boolean headlightsOff = car.isHeadlightsTurnedOff();
        int currentTime = LocalDateTime.now().getHour();

        assertEquals(currentTime >= 6 && currentTime < 20, headlightsOff);
    }

    @Test
    void testCarTypeBasedOnSeason() {

        assertEquals("Winter", ConfigurationClass.getSeasonWithIf(Month.JANUARY));
        assertEquals("Spring", ConfigurationClass.getSeasonWithIf(Month.APRIL));
        assertEquals("Summer", ConfigurationClass.getSeasonWithIf(Month.JULY));
        assertEquals("Autumn", ConfigurationClass.getSeasonWithIf(Month.OCTOBER));
    }

    @Test
    public void shouldMatchCarTypeToSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("car");

        String carType = car.getCarType();
        Month month = LocalDateTime.now().getMonth();

        String expectedCarType;
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            expectedCarType = "SUV";
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            expectedCarType = "Cabrio";
        } else {
            expectedCarType = "Sedan";
        }

        assertEquals(expectedCarType, carType);
    }
}