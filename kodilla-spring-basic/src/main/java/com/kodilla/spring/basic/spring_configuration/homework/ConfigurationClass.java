package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.Month;

@Configuration
public class ConfigurationClass {

    @Bean
    public Car car() {
        LocalDateTime date = LocalDateTime.now();
        String season = getSeasonWithIf(date.getMonth());
        boolean isHeadlightsOff = isHeadlightsOff(date);

        if (season.equals("Winter")) {
            return new SUV(isHeadlightsOff);
        } else if (season.equals("Spring") || season.equals("Autumn")) {
            return new Sedan(isHeadlightsOff);
        } else {
            return new Cabrio(isHeadlightsOff);
        }
    }

    //private static String getSeason(int month) {
    //    return switch (month) {
    //        case 12, 1, 2 -> "Winter";
    //        case 3, 4, 5 -> "Spring";
    //       case 6, 7, 8 -> "Summer";
    //        case 9, 10, 11 -> "Autumn";
    //        default -> throw new IllegalArgumentException("Invalid month: " + month);
    //    };
    //}
    public static String getSeasonWithIf(Month month) {     // do testów zmieniona na public
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return "Winter";
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return "Summer";
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return "Spring";
        } else {
            return "Autumn";
        }
    }

    private static boolean isHeadlightsOff(LocalDateTime date) {
        if (date.getHour() >= 6 && date.getHour() < 20) {
            return true;
        } else {
            return false;
        }
    }
}