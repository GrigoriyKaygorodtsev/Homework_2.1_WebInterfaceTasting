package ru.netology.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestWebsite {
    private WebDriver driver;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
    }


    @BeforeEach
   public void beforeEach() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("");
        options.addArguments("");
        options.addArguments("");
        driver = new ChromeDriver(options);
        driver.get("http://localhost:9999");

    }

    @AfterEach
    private void afterEach() {
        driver.quit();
        driver = null;
    }

    @Test
    public void shouldBeFailedIncorrectNameInput() {
        driver.findElement(By.xpath("")).sendKeys();
        driver.findElement(By.xpath("")).sendKeys();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
        assertEquals("" ,
                driver.findElement(By.xpath(""))
                        .getText().trim();
    }



}



