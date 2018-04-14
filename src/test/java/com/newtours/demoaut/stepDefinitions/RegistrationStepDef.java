package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.pageObject.UserRegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class RegistrationStepDef {

    UserRegisterPage userRegisterPage = new UserRegisterPage(Helper.driver);

    @And ( "^I click on register link$" )
    public void iClickOnRegisterLink() throws Throwable {
        userRegisterPage.goToRegisterPage();

    }

    @And ( "^I fill in all the details for registration$" )
    public void iFillInAllTheDetailsForRegistration() throws Throwable {
        userRegisterPage.fillRegisterationPage();
    }

    @When ( "^I hit submit button$" )
    public void iHitSubmitButton() throws Throwable {
        userRegisterPage.submit();
    }

}



