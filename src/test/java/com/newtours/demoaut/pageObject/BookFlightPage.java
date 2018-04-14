package com.newtours.demoaut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookFlightPage extends BasePage {

    public BookFlightPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( name = "passFirst0" )
    private WebElement firstName;

    @FindBy ( name = "passLast0" )
    private WebElement lastName;

    @FindBy ( name = "creditnumber" )
    private WebElement creditCardnumber;

    @FindBy ( name = "buyFlights" )
    private WebElement buyFlightsButton;

    public void bookFlight(String fname, String lname, String ccNumber) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        creditCardnumber.sendKeys(ccNumber);
        buyFlightsButton.click();
        checkPageTitle("Flight Confirmation: ");
    }
}


