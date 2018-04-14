package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.pageObject.BookFlightPage;
import cucumber.api.java.en.And;

import static com.newtours.demoaut.stepDefinitions.Helper.driver;

public class BookFlightStepdef {

    @And ( "^Book the selected flight$" )
    public void bookTheSelectedFlight() throws Throwable {
        BookFlightPage bookFlightPage = new BookFlightPage(driver);
        bookFlightPage.bookFlight("first", "lastName", "4111111111111111");
    }
}
