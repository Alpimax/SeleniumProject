package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
//         for setup
        WebDriver driver = new ChromeDriver();
//        polymorphism
        driver.get("https://www.google.com");
//        get for website.
        driver.findElement(By.name("q")).sendKeys("playstation");
        Thread.sleep(500);
        driver.findElement(By.className("gNO89b")).click();
        driver.navigate().back();


        driver.navigate().forward();

        driver.navigate().refresh();


//        try {
            driver.quit();
//        }catch (Exception e){
//            driver.get("https://www.tesla.com");
//        }


// test case created.

    }
}
