package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTestSuite {

    @Test
    void shouldCreateWaiterWithCorrectSalaryAndResponsibilities() {
        // Given
        Kelner kelner = new Kelner(4500);

        // When
        double salary = kelner.getSalary();
        String responsibilities = kelner.getResponsibilities();

        // Then
        assertEquals(4500, salary);
        assertEquals(
                "Obsluga klientow lokalu gastronomicznego",
                responsibilities
        );
    }

    @Test
    void shouldCreateCookWithCorrectSalaryAndResponsibilities() {
        // Given
        Kucharz kucharz = new Kucharz(5000);

        // When
        double salary = kucharz.getSalary();
        String responsibilities = kucharz.getResponsibilities();

        // Then
        assertEquals(5000, salary);
        assertEquals(
                "Przygotowywanie posilkow",
                responsibilities
        );
    }

    @Test
    void shouldCreateChefWithCorrectSalaryAndResponsibilities() {
        // Given
        SzefKuchni szefKuchni =
                new SzefKuchni(
                        7000,
                        "Zarzadzanie praca kuchni"
                );

        // When
        double salary = szefKuchni.getSalary();
        String responsibilities =
                szefKuchni.getResponsibilities();

        // Then
        assertEquals(7000, salary);
        assertEquals(
                "Zarzadzanie praca kuchni",
                responsibilities
        );
    }

    @Test
    void shouldCreatePersonWithJob() {
        // Given
        Job job = new Kucharz(5000);

        // When
        Person person =
                new Person(
                        "Jan",
                        30,
                        job
                );

        // Then
        assertEquals("Jan", person.getFirstName());
        assertEquals(30, person.getAge());
        assertSame(job, person.getJob());
    }

    @Test
    void shouldShowPersonResponsibilities() {
        // Given
        Job job = new Kucharz(5000);
        Person person = new Person("Jan", 30, job);

        // When
        person.showResponsibilities();

        // Then
        assertEquals(
                "Przygotowywanie posilkow",
                person.getJob().getResponsibilities()
        );
    }
}