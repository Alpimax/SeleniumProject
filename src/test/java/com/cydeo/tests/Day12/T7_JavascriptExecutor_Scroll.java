package com.cydeo.tests.Day12;

import com.cydeo.Z_utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class T7_JavascriptExecutor_Scroll {

    @Test
    public void task7_javascriptexecutor_scroll_test() {
        Actions action =new Actions(Driver.getDriver());
        action.doubleClick();
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large


        //3- Scroll down to “Cydeo” link


        //4- Scroll up to “Home” link


    }
}