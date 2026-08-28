package com.kodilla.testcontainers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class BrowserTest {

    public BrowserWebDriverContainer chromeContainer;

    @Before
    public void setUp() {
        chromeContainer = new BrowserWebDriverContainer()
                .withCapabilities(new ChromeOptions());
        chromeContainer.start();
    }

    @Test
    public void chromeTest() throws IOException {
        RemoteWebDriver driver = chromeContainer.getWebDriver();

//        driver.get("https://allegro.pl"); // z uwagi na to że strona allegro ma zgody do przeklikania,
//        zabezpieczenia antybot screenshot jest pusty (podobna sytuajcja była już w jednym z ćwiczeń z poprzednich modułów)
//        zamieniłem więc ponownie allegro na ebay i screenshot zawiera teraz obraz strony www
        driver.get("https://ebay.com");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,
                new File("./build/screenshots/" + screenshot.getName()));
    }

    @After
    public void tearDown() {
        chromeContainer.stop();
    }

}
