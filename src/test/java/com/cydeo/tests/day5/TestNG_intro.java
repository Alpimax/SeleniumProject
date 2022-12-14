package com.cydeo.tests.day5;

import org.testng.annotations.*;

public class TestNG_intro {

    @Test (priority = 1 )
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test (priority = 2)
    public void myTest2(){
        System.out.println("test2 is running...");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("-->After Method is running");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("--> Before Class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("--> After class is running");
    }

}
