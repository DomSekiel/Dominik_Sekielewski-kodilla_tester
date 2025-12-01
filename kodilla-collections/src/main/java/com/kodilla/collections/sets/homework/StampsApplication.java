package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Kwiaty polskie", 4.00, 5.00, true));
        stamps.add(new Stamp("Poczet krolow polskich", 3.50, 4.25, false));
        stamps.add(new Stamp("Glowy wawelskie", 4.50, 4.50, true));
        stamps.add(new Stamp("Kwiaty polskie", 4.00, 5.00, true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
