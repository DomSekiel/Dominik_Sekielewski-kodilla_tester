package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StorePomApplication {

    public static void main(String[] args) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        StorePom storePom = new StorePom(driver);
        //int results;

        //results = storePom.search("NoteBook");
        //System.out.println("Znalezione produkty NoteBook: " + results);

        //results = storePom.search("School");
        //System.out.println("Znalezione produkty School: " + results);

        //results = storePom.search("Brand");
        //System.out.println("Znalezione produkty Brand: " + results);

        //results = storePom.search("Business");
        //System.out.println("Znalezione produkty Business: " + results);

        //results = storePom.search("Gaming");
        //System.out.println("Znalezione produkty Gaming: " + results);

        //results = storePom.search("Powerful");
        //System.out.println("Znalezione produkty Powerful: " + results);

        String[] phrases = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

        for (String phrase : phrases) {
            int results = storePom.search(phrase);
            System.out.println("Znalezione produkty " + phrase + ": " + results);
        }

        storePom.close();
    }
}
