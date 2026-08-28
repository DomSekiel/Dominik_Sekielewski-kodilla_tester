package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom extends AbstractPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    //public static void main(String[] args) {
    public KodillaLoginPom(WebDriver driver) {
        //System.setProperty("webdriver.chrome.driver", "chromedriver");

        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public boolean login(String email, String password) {
        //WebElement inputField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailField.sendKeys(email);
        //inputField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordField.sendKeys(password);
        loginButton.click();
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.dismiss();
        driver.switchTo();

        return message.equals("Jesteś teraz zalogowany!");

    }

    public void close() {
        driver.close();
    }
}