package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    void testReturnTeacherNameWhenTeacherIsAssigned() {
        // given
        Teacher teacher = new Teacher("Maciej Skorza");
        Student student = new Student("Piotr Zielinski", teacher);

        // when
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");

        // then
        assertEquals("Maciej Skorza", teacherName);
    }

    @Test
    void testReturnUndefinedWhenTeacherIsNull() {
        // given
        Teacher teacher = new Teacher("<undefined>");
        Student student = new Student("Robert Lewandowski", null);

        // when
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");

        // then
        assertEquals("<undefined>", teacherName);
    }
}