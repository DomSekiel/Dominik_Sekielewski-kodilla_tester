package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllegroTestingApp {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.ebay.com");


        WebElement categoryDropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        categoryDropdown.click();

        WebElement consumerElectronicsOption = driver.findElement(By.xpath("//select[@id='gh-cat']/option[contains(text(),'Consumer Electronics')]"));
        consumerElectronicsOption.click();

        WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchField.sendKeys("Mavic mini");
        searchField.submit();
        }
    }