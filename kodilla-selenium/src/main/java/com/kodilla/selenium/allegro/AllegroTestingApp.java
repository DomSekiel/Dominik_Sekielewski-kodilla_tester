package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.ebay.com");


        //WebElement categoryDropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        WebElement categoryDropdown = driver.findElement(By.id("gh-cat"));
        categoryDropdown.click();

        //WebElement consumerElectronicsOption = driver.findElement(By.xpath("//select[@id='gh-cat']/option[contains(text(),'Consumer Electronics')]"));
        WebElement consumerElectronicsOption = driver.findElement(By.cssSelector("#gh-cat > option[value='293']"));
        consumerElectronicsOption.click();

        //WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Mavic mini");
        searchField.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.s-card")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("li.s-card"));

        for (WebElement product : productCards) {
            System.out.println("----------");
            System.out.println(product.getText());
        }
    }
}