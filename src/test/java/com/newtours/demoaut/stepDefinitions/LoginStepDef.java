package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.pageObject.HomePage;
import com.newtours.demoaut.pageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage(Helper.driver);

    @Given ( "^I navigate to homePage$" )
    public void iGoToBookingWebsite() throws Throwable {
        new HomePage(Helper.driver).navigatetoHomepage();
    }

    @When ( "^I hit signIn button$" )
    public void iHitSignInButton() throws Throwable {
        loginPage.submit();
    }

    @And ( "^I fill in my login details as \"([^\"]*)\" and \"([^\"]*)\"$" )
    public void iFillInMyLoginDetailsAsAnd(String username, String password) throws Throwable {
        loginPage.fill_username_password(username, password);
    }

    @Then ( "^verify user is not signed in$" )
    public void verifyUserIsNotSignedIn() throws Throwable {
        loginPage.registerPage();
    }

}



