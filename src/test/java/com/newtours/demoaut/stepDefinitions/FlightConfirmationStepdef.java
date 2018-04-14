package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.pageObject.FlightConfirmationPage;
import cucumber.api.java.en.And;

public class FlightConfirmationStepdef {

    @And ( "^User is presented with flight confirmation page$" )
    public void userIsPresentedWithFlightConfirmationPage() throws Throwable {
        FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage(Helper.driver);
        flightConfirmationPage.flightConfirmation();
    }
}
