package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StorePom extends StoreAbstractPom {

    private static final String STORE_URL = "https://kodilla.com/pl/test/store";

    @FindBy(name = "search")
    private WebElement searchField;

    @FindBy(css = "div.element")
    private List<WebElement> products;

    public StorePom(WebDriver driver) {
        super(driver);
        driver.get(STORE_URL);
        PageFactory.initElements(this.driver, this);
    }

    public int search(String phrase) {
        searchField.clear();
        searchField.sendKeys(phrase);
        return products.size();
    }

    public boolean isCaseInsensitive(String phrase) {

        searchField.clear(); //musi być inaczej test nie przejdzie
        searchField.sendKeys(phrase);
        int normal = products.size();

        searchField.clear();
        searchField.sendKeys(phrase.toLowerCase());
        int lower = products.size();

        searchField.clear();
        searchField.sendKeys(phrase.toUpperCase());
        int upper = products.size();

        return normal == lower && normal == upper;
    }

    public void close() {
        driver.close();
    }
}