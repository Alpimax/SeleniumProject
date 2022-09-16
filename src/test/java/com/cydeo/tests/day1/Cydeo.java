package com.cydeo.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo {

    public static void main(String[] args) {
        String [] arr =new  String [10];
        for (int i = 0; i < 10; i++) {
            WebDriverManager.chromiumdriver().setup();
            WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();

           driver.get("https://www.cydeo.com");
            String title = driver.getTitle();
            if(title.equals("Cydeo")){
                arr[i] = "Passed " + (i +1) ;
            }else{
                arr[i] = "Failed " + (i +1);
            }
            driver.quit();
        }
        for (String each:arr){
            System.out.println(each);
        }
    }







}
