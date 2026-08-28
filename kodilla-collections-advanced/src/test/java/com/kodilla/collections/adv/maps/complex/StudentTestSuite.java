package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestSuite {

    @Test
    void shouldReturnStudentData() {
        // Given
        Student student = new Student(
                "Mikael",
                "Ishak"
        );

        // When
        String firstname = student.getFirstname();
        String lastname = student.getLastname();

        // Then
        assertEquals("Mikael", firstname);
        assertEquals("Ishak", lastname);
    }

    @Test
    void shouldCompareStudents() {
        // Given
        Student student1 = new Student(
                "Mikael",
                "Ishak"
        );

        Student student2 = new Student(
                "Mikael",
                "Ishak"
        );

        // When
        boolean result = student1.equals(student2);

        // Then
        assertTrue(result);
        assertEquals(
                student1.hashCode(),
                student2.hashCode()
        );
    }
}