package com.cydeo.tests.day5;

import com.cydeo.Z_utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Set up browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
        System.out.println();
    }

    @Test
    public void iframeTask(){

//        4. Assert: “Your content goes here.” Text is displayed.


//        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”



    }
}