package com.newtours.demoaut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlightPage extends BasePage {


    public SearchFlightPage(WebDriver driver) {
        super(driver);
    }


    @FindBy ( linkText = "Flights" )
    public WebElement flights;

    @FindBy ( name = "passCount" )
    public WebElement passengerCountDropDown;

    @FindBy ( name = "fromPort" )
    public WebElement fromPortDropDown;

    @FindBy ( name = "toPort" )
    public WebElement toPortDropDown;

    @FindBy ( name = "fromMonth" )
    public WebElement fromMonthDropDown;

    @FindBy ( name = "fromDay" )
    public WebElement fromDayDropDown;

    @FindBy ( name = "toMonth" )
    public WebElement toMonthDropDown;

    @FindBy ( name = "toDay" )
    public WebElement toDayDropDown;

    @FindBy ( xpath = "//input[@value='Business']" )
    public WebElement servClassRadioButton;

    @FindBy ( name = "findFlights" )
    public WebElement findFlightsButton;


    public void navigateToSearchFlightPage() {
        flights.click();
        checkPageTitle("Find a Flight:");


    }

    public void getFromAndToPorts(String from, String to) {
        selectDropDownByValue(from, fromPortDropDown);
        selectDropDownByValue(to, toPortDropDown);
    }

    public void getFromAndToDates(String fromDate, String toDate, String month) {
        selectDropDownByValue(fromDate, toDayDropDown);
        selectDropDownByValue(toDate, fromDayDropDown);
        selectDropDownByText(month, fromMonthDropDown);
        selectDropDownByText(month, toMonthDropDown);
    }

    public void searchFlight() {
        findFlightsButton.click();
        checkPageTitle(driver, ExpectedConditions.titleContains("Select a Flight:"));
    }

    private void checkPageTitle(WebDriver driver, ExpectedCondition<Boolean> isTrue) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(isTrue);
    }

}


