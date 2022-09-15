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
        driver.get("https://www.google.com/?client=safari");
//        get for website.
        driver.findElement(By.name("q")).sendKeys("mkaraas");
        Thread.sleep(1000);
        driver.findElement(By.className("gNO89b")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
// test case created.

    }
}
