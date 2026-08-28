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

    @Test
    void testShouldReturnStudentData() {
        // given
        Teacher teacher = new Teacher("Maciej Skorza");
        Student student = new Student("Piotr Zielinski", teacher);

        // when
        String studentName = student.getName();
        Teacher studentTeacher = student.getTeacher();

        // then
        assertEquals("Piotr Zielinski", studentName);
        assertEquals(teacher, studentTeacher);
    }

    @Test
    void testShouldReturnTeacherName() {
        // given
        Teacher teacher = new Teacher("Maciej Skorza");

        // when
        String teacherName = teacher.getName();

        // then
        assertEquals("Maciej Skorza", teacherName);
    }
}