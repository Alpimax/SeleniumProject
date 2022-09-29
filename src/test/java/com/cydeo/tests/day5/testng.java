package com.cydeo.tests.day5;

import com.cydeo.Z_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class testng {
    public static void main(String[] args) {
      WebDriver driver =  WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://practice.cydeo.com/radio_buttons");

    WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='football']"));
    hockeyButton.click();

    }

}
