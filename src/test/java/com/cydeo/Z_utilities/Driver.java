package com.cydeo.Z_utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
     Creating a private constructor, so we are closing access to the object of this class
     from outside of any classes
     */
    private Driver(){}

    /*
    Making our 'driver' instance private, so that it is not reachable from outside of any class
    We make it static, because we want it to run before anyting else,
    also we will use it in static method
     */
    private static WebDriver driver ;

    /*
    Create re-usable utility method which will return same driver instance when we call it.
     */
    public static WebDriver getDriver(){

        if(driver == null){  // if driver/browser was never opened

            String browserType = ConfigurationReader.getProperty("browser");

        /*
        Depending on the browserType our switch statement will determine
        to open specific type of browser/driver
         */
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();

                case "chrome2":
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver(new ChromeOptions().setHeadless(true));

                case "fireFox":
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();

                case "firefox2":
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver(new FirefoxOptions().setHeadless(true));

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    return new SafariDriver();
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
            }
            return null;
        }


        // Same driver instance will be returned every time we call Driver.getDriver() method
        return driver;

    }


    public static void closeDriver(){
        if(driver!=null) {
            driver.quit(); // this line will kill the session. value will noy be null
            driver = null;
        }
    }

}
