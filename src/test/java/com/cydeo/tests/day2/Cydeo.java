package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            WebDriverManager.chromiumdriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.cydeo.com");
            String tittle = driver.getTitle();
            if(tittle.equals("Cydeo")){
                System.out.println("Passed " + i);
            }
            driver.quit();
        }
    }
}
