package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Objects;

public class School {
    private String schoolName;
    private ArrayList<Integer> studentsInClass;

    public School(String schoolName, ArrayList<Integer> studentsInClass) {
        this.schoolName = schoolName;
        this.studentsInClass = studentsInClass;
    }

    public int getSumOfStudents() {
        int sum = 0;
        for (int liczba : studentsInClass) {
            sum += liczba;
        }
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public ArrayList<Integer> getStudentsInClass() {
        return studentsInClass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) && Objects.equals(studentsInClass, school.studentsInClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, studentsInClass);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsInClass=" + studentsInClass +
                '}';
    }
}