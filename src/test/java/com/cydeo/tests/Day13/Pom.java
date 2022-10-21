package com.cydeo.tests.Day13;

import com.cydeo.Z_utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
    public Pom() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//strong[text()='Done!']")
    public WebElement doneMessega;

    @FindBy (xpath =  "//img[@alt='square pants']")
    public WebElement spongeBobImage;
}
