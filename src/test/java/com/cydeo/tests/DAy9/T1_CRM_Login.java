package com.cydeo.tests.DAy9;

import com.cydeo.Z_utilities.WebDriverFactory;
import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_CRM_Login extends TestBase {
    @Test
    public  void crm_login_test(){
       driver.get("http://login1.nextbasecrm.com/");

    }

}
