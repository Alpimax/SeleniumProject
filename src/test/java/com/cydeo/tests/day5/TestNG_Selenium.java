package com.cydeo.tests.day5;

import com.cydeo.Z_utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    @Test
    public void googleTitle(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
