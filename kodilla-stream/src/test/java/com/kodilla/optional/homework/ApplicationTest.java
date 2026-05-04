package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    void testShouldReturnTeacherNameWhenTeacherIsAssigned() {
        // given
        Teacher teacher = new Teacher("Maciej Skorza");
        Student student = new Student("Piotr Zielinski", teacher);

        // when
        String result = student.getTeacherName();

        // then
        assertEquals("Maciej Skorza", result);
    }

    @Test
    void testShouldReturnUndefinedWhenTeacherIsNull() {
        // given
        Student student = new Student("Robert Lewandowski", null);

        // when
        String result = student.getTeacherName();

        // then
        assertEquals("<undefined>", result);
    }
}