package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Maciej Skorza");
        Teacher teacher2 = new Teacher("Jan Urban");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Piotr Zielinski", teacher1));
        students.add(new Student("Robert Lewandowski", null));
        students.add(new Student("Nicola Zalewski", teacher2));
        students.add(new Student("Jan Bednarek", null));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("uczen: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
