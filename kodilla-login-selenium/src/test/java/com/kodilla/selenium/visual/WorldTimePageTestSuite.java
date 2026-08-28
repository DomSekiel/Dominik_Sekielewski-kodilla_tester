package com.kodilla.selenium.visual;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class WorldTimePageTestSuite {

    @Test
    void shouldOpenWorldTimePage() {
        // Given
        WebDriver webDriver = mock(WebDriver.class);
        WorldTimePage worldTimePage = new WorldTimePage(webDriver);

        // When
        worldTimePage.open();

        // Then
        verify(webDriver).get(
                "https://www.worldtimeserver.com/current_time_in_AW.aspx"
        );
    }

    @Test
    void shouldCloseBrowser() {
        // Given
        WebDriver webDriver = mock(WebDriver.class);
        WorldTimePage worldTimePage = new WorldTimePage(webDriver);

        // When
        worldTimePage.close();

        // Then
        verify(webDriver).quit();
    }
}