package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        WebElement obj = driver.findElement(By.id("gbqfbb"));

        String text = obj.getAttribute("value");

        if(text.equals("I'm Feeling Lucky")){
            System.out.println("Passed");
        }else
            System.out.println("Failed");

        driver.quit();
    }
}
