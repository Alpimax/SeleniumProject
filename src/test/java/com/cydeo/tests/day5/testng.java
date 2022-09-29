package com.cydeo.tests.day5;

import com.cydeo.Z_utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class testng {
    public static void main(String[] args) {
      WebDriver drive =  WebDriverFactory.getDriver("chrome");
      drive.manage().window().maximize();
      drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    }
}
