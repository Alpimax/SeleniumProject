package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//         for setup
        WebDriver driver = new ChromeDriver();
//        polymorphism
        driver.get("https://www.tesla.com/");
//        get for website.

// test case created.

    }
}
