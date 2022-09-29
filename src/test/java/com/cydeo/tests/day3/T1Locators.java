package com.cydeo.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1Locators {
    public static void main(String[] args) {
//        1- Open a chromeBrowser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//      2- Go to https;// login1.nextbasecrm.com/
        driver.get("https;// login1.nextbasecrm.com/");
//      3-  Enter  incorrect username: "incorrect"
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");
//      4- Enter incorrect password: "incorrect"
//        mac : option + enter
//        windows : alt + enter
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        user_password.sendKeys("incorrect");
//        5 - Click to Login button
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();
//        6- Verify error message text is as expected:
//        expected : Incorrect  login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

    }
}
