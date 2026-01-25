package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class Clock {

    private final LocalDateTime time;

    public Clock() {
        this.time = LocalDateTime.now();
        System.out.println("Creating new Clock bean: " + time);
    }

    public LocalDateTime getTime() {
        return time;
    }
}