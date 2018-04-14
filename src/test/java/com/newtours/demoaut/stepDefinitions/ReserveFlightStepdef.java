package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.pageObject.ReserveFlightPage;
import cucumber.api.java.en.Then;

public class ReserveFlightStepdef {

    @Then ( "^Select the flight from results$" )
    public void selectTheFlightFromResults() throws Throwable {
        ReserveFlightPage reserveFlightPage = new ReserveFlightPage(Helper.driver);
        reserveFlightPage.bookFlight();
    }
}
