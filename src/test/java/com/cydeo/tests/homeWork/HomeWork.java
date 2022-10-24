package com.cydeo.tests.homeWork;

import com.cydeo.Z_utilities.Driver;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork {

    @Test
    public void urlVerification() {
        Driver.getDriver().navigate().to("https://practice.cydeo.com");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("cydeo"));

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Practice";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void etsy_title() {
        Driver.getDriver().get("https://www.etsy.com");

    }
}
