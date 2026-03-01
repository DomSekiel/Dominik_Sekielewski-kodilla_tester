package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public class StoreAbstractPom {
    protected WebDriver driver;

    public StoreAbstractPom(WebDriver driver) {
        this.driver = driver;
    }
}