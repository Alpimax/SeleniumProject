package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
//         for setup
        WebDriver driver = new ChromeDriver();
//        polymorphism
        driver.get("https://www.google.com");
//        get for website.
        driver.findElement(By.name("q")).sendKeys("playstation");
        Thread.sleep(1000);
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("MUxGbd v0nnCb lyLwlc aLF0Z OSrXXb")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("web-store-tab tertiary-tab__link")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("psw-fade-in psw-center psw-l-fit-cover")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();

// test case created.

    }
}
