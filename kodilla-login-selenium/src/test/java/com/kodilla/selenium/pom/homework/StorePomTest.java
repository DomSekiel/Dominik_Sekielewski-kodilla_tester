package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class StorePomTest {
    StorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

        storePom = new StorePom(driver);
    }

    //@Test
    //public void testSearchResultsCount() {

    //    assertEquals(2, storePom.search("NoteBook"));
    //    assertEquals(1, storePom.search("School"));
    //    assertEquals(1, storePom.search("Brand"));
    //    assertEquals(0, storePom.search("Business"));
    //    assertEquals(1, storePom.search("Gaming"));
    //    assertEquals(0, storePom.search("Powerful"));
    //}

    @Test
    void shouldFindTwoResultsForNotebook() {
        assertEquals(2, storePom.search("NoteBook"),
                "Expected 2 results for phrase 'NoteBook'");
    }

    @Test
    void shouldFindOneResultForSchool() {
        assertEquals(1, storePom.search("School"),
                "Expected 1 result for phrase 'School'");
    }

    @Test
    void shouldFindOneResultForBrand() {
        assertEquals(1, storePom.search("Brand"),
                "Expected 1 result for phrase 'Brand'");
    }

    @Test
    void shouldFindZeroResultForBusiness() {
        assertEquals(0, storePom.search("Business"),
                "Expected 0 result for phrase 'Business'");
    }

    @Test
    void shouldFindOneResultForGaming() {
        assertEquals(1, storePom.search("Gaming"),
                "Expected 1 result for phrase 'Gaming'");
    }

    @Test
    void shouldFindZeroResultForPowerful() {
        assertEquals(0, storePom.search("Powerful"),
                "Expected 0 result for phrase 'Powerful'");
    }


    @Test
    public void testSearchIsCaseInsensitive() {

        assertTrue(storePom.isCaseInsensitive("NoteBook"));
        assertTrue(storePom.isCaseInsensitive("School"));
        assertTrue(storePom.isCaseInsensitive("Brand"));
        assertTrue(storePom.isCaseInsensitive("Business"));
        assertTrue(storePom.isCaseInsensitive("Gaming"));
        assertTrue(storePom.isCaseInsensitive("Powerful"));
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}