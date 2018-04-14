package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.pageObject.SearchFlightPage;
import com.newtours.demoaut.pageObject.UserRegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SearchFlightStepdef {

    SearchFlightPage searchFlightPage = new SearchFlightPage(Helper.driver);

    @And ( "^I login and click on flights link$" )
    public void iClickOnFlightsLink() throws Throwable {
        UserRegisterPage userRegisterPage = new UserRegisterPage(Helper.driver);
        userRegisterPage.goToRegisterPage();
        userRegisterPage.fillRegisterationPage();
        userRegisterPage.submit();
        searchFlightPage.navigateToSearchFlightPage();
    }

    @When ( "^Search for flights from \"([^\"]*)\" to \"([^\"]*)\"$" )
    public void searchForTheFlightFromTo(String from, String to) throws Throwable {
        searchFlightPage.getFromAndToPorts(from, to);
    }

    @And ( "^Select the dates between \"([^\"]*)\" to \"([^\"]*)\" for month \"([^\"]*)\"$" )
    public void selectTheDatesBetweenToWithMonthAs(String fromDate, String toDate, String month) throws Throwable {
        searchFlightPage.getFromAndToDates(fromDate, toDate, month);
        searchFlightPage.searchFlight();
    }


}
