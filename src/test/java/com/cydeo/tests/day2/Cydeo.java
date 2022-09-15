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
                arr[i] = "Passed " + (i +1);
            }
            driver.quit();
        }
        for (String each:arr){
            System.out.println(each);
        }
    }



//    a+b = 10
//    a = 10-b
//    b = 10-a


//     5+3 = 8
//     5 = 8-3
//     3 = 8-5

//    2 + x = 12  ?


//    x = 12 - 2










}
