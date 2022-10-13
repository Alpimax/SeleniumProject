package com.cydeo.tests.DAy9;

import com.cydeo.Z_utilities.WebDriverFactory;
import com.cydeo.tests.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_CRM_Login extends TestBase {
    @Test
    public  void crm_login_test(){
       driver.get("http://login1.nextbasecrm.com/");

    }

}
