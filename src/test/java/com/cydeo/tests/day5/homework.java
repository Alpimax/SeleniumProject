package com.cydeo.tests.day5;

import com.cydeo.Z_utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homework {

//    1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Select Illinois
//4. Select Virginia
//5. Select California
//6. Verify final selected option is California.
//Use all Select options. (visible text, value, index)
        WebDriver driver;
    @BeforeMethod
        public void firstWorks(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.time(driver);
        WebDriverFactory.max(driver);
    }
    @Test
    public void getWeb() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        select.selectByValue("IL");
        Thread.sleep(1000);
        select.selectByValue("VA");
        Thread.sleep(1000);
        select.selectByValue("CA");
        Thread.sleep(1000);
        String expected = "California";
        String actual =select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,expected);

    }
    @AfterMethod
    public void closeWeb(){
        driver.quit();
    }






}class HomeWork2{

}
