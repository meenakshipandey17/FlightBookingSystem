package com.newtours.demoaut.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightConfirmationPage extends BasePage {

    public FlightConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//img[@src='/images/forms/Logout.gif']" )
    private WebElement logOutButton;

    @FindBy ( xpath = "//img[@src='/images/forms/home.gif']" )
    private WebElement homeButton;

    @FindBy ( xpath = "//img[@src='/images/forms/backtoflights.gif']" )
    private WebElement backOfFlights;

    public void flightConfirmation() {
        checkPageTitle("Flight Confirmation");

        Assert.assertTrue(logOutButton.isDisplayed());
        Assert.assertTrue(homeButton.isDisplayed());
        Assert.assertTrue(homeButton.isDisplayed());
    }
}



