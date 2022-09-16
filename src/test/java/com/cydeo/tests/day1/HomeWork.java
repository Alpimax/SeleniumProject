package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomeWork {
    public static void main(String[] args) {
        String[] arrUrl = new String[10];
        String[] arrTitle = new String[10];

        for (int i = 0; i < 10; i++) {
            WebDriverManager.chromiumdriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://practice.cydeo.com ");

            String currentlyURL = driver.getCurrentUrl();
            if (currentlyURL.contains("Cydeo")) {
                arrUrl[i] = "Passed   " + (i + 1);
            } else {
                arrUrl[i] = "Failed " + (i + 1);
            }
            String title = driver.getTitle();
            if (title.equals("Practice")) {
                arrTitle[i] = "Passed   " + (i + 1);
            }else {
                arrTitle[i] = "Failed " + (i + 1);
            }

            driver.quit();
        }
        System.out.println( "For this one URL ");
        for (String each : arrUrl) {
            System.out.println(each);
        }
        for (String each : arrTitle) {
            System.out.println(each);
        }
    }

}
