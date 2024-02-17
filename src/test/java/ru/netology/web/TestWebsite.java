package ru.netology.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestWebsite {
    private WebDriver driver;


    @BeforeEach
    void setUp() { driver = new ChromeDriver(); }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;

        @Test
        void shouldTestSomerhing() {
            throw new UnsupportedOperationException();

        }
    }
}
