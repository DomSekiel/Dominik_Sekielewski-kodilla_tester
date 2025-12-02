package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal principal1 = new Principal("Adam Mickiewicz");
        Principal principal2 = new Principal("Henryk Sienkiewicz");
        Principal principal3 = new Principal("Boleslaw Prus");

        ArrayList<Integer> quantityMickiewicz = new ArrayList<>();
        quantityMickiewicz.add(25);
        quantityMickiewicz.add(22);
        quantityMickiewicz.add(30);
        quantityMickiewicz.add(28);

        ArrayList<Integer> quantitySienkiewicz = new ArrayList<>();
        quantitySienkiewicz.add(12);
        quantitySienkiewicz.add(18);
        quantitySienkiewicz.add(40);
        quantitySienkiewicz.add(32);

        ArrayList<Integer> quantityPrus = new ArrayList<>();
        quantityPrus.add(14);
        quantityPrus.add(31);
        quantityPrus.add(27);
        quantityPrus.add(24);

        School school1 = new School("im. Adama Mickiewicza", quantityMickiewicz);
        School school2 = new School("im. Henryka Sienkiewicza", quantitySienkiewicz);
        School school3 = new School("im. Boleslawa Prusa", quantityPrus);

        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);
        schoolDirectory.put(principal3, school3);

        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet())
        {
            School school = entry.getValue();
            Principal principal = entry.getKey();
            System.out.println("Szkola: " + school.getSchoolName());
            System.out.println("Dyrektor: " + principal.getName());
            System.out.println("Liczba uczniow: " + school.getSumOfStudents());
        }
    }
}