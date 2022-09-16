package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleBrowser {
    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.chromedriver().setup();

    WebDriver driver1= new ChromeDriver();
    WebDriver driver2= new EdgeDriver();
    WebDriver driver3= new FirefoxDriver();

    WebDriver [] arr= {driver1,driver2,driver3};
    String expectedUrl="cydeo";
    String expectedTitle="Practice";

        for (WebDriver each: arr) {
        each.manage().window().maximize();
        each.get("https://practice.cydeo.com");
        String currentUrl = each.getCurrentUrl();

        if (currentUrl.contains(expectedUrl)) {
            System.out.println("Current url in : is the same as expected url, TC PASS");
        } else System.out.println("Current url in :" + each + " is not the same as expected url, TC FAIL");

        String currentTitle = each.getTitle();
        if (currentTitle.equals(expectedTitle)) {
            System.out.println("Current title in :" + each + " is the same as expected title Practice, TC PASS");
        } else System.out.println("Current title in :" + each + " is NOT the same as expected title Practice, TC FAIL");


        each.quit();
    }
}
}
