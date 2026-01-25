package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ClockTestSuite {

    @Test
    public void shouldCreateDifferentClockBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);
        Clock thirdClock = context.getBean(Clock.class);

        Assertions.assertNotEquals(firstClock.getTime(), secondClock.getTime());
        Assertions.assertNotEquals(secondClock.getTime(), thirdClock.getTime());
        Assertions.assertNotEquals(firstClock.getTime(), thirdClock.getTime());
    }
}