package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo {

    public static void main(String[] args) {
        String [] arr =new  String [5];
        for (int i = 0; i < 5; i++) {
            WebDriverManager.chromiumdriver().setup();
            WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();

           driver.get("https://www.cydeo.com");
            String tittle = driver.getTitle();
            if(tittle.equals("Cydeo")){
                arr[i] = "Passed " + i;
            }
            driver.quit();
        }
        for (String each:arr){
            System.out.println(each);
        }
    }
}
