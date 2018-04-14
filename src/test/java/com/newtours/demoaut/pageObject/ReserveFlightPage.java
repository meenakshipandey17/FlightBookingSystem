package com.newtours.demoaut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReserveFlightPage extends BasePage {


    public ReserveFlightPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( name = "reserveFlights" )
    public WebElement reserveFlightsButton;


    public void bookFlight() {
        reserveFlightsButton.click();
        checkPageTitle("Book a Flight");

    }


}


