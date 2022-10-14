package com.cydeo.tests.DAy9;

import com.cydeo.Z_utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test78byErkan {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa1.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername.sendKeys("storemanager75");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(1000);
        WebElement customerMenu = driver.findElement(By.xpath(("(//a[@class='unclickable'])[2]")));
        Thread.sleep(1000);
        WebElement accMenu = driver.findElement(By.xpath("(//a/span[@class='title title-level-2'])[7]"));
        Thread.sleep(1000);
        //Mouse'in customer kismina gidip sonra accounts kismina gitmesi icin gerekli olan action.
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(customerMenu).pause(3000).moveToElement(accMenu).click().perform();

//        WebElement drop = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
//        drop.click();
//        WebElement filterButton = driver.findElement(By.xpath("//button/input[@type='checkbox']"));
//        filterButton.click();
//
//        List<WebElement> filters = driver.findElements(By.xpath("//div [contains(@class,'btn filter-criteria-selector')]"));
//
//        System.out.println(filters.size());
//        for (WebElement eachfilter : filters) {
//            System.out.println(eachfilter.getText());
//        }
    }
}