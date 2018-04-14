package com.newtours.demoaut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterPage extends BasePage {

    public UserRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( linkText = "REGISTER" )
    public WebElement registerPageLink;

    @FindBy ( name = "firstName" )
    public WebElement firstName;

    @FindBy ( name = "lastName" )
    public WebElement lastName;

    @FindBy ( name = "phone" )
    public WebElement phone;

    @FindBy ( id = "userName" )//id should be named with email
    public WebElement email;

    @FindBy ( name = "address1" )
    public WebElement address1;

    @FindBy ( name = "address2" )
    public WebElement address2;

    @FindBy ( name = "city" )
    public WebElement city;

    @FindBy ( name = "state" )
    public WebElement state;

    @FindBy ( name = "postalCode" )
    public WebElement postalCode;

    @FindBy ( name = "country" )
    public WebElement countryDropDown;

    @FindBy ( id = "email" )
    public WebElement userName;

    @FindBy ( name = "password" )
    public WebElement password;

    @FindBy ( name = "confirmPassword" )
    public WebElement confirmPassword;

    @FindBy ( name = "register" )
    public WebElement submit;

    @FindBy ( xpath = "//b[contains(.,' Note: Your user name is')]" )
    public WebElement successFulRegistration;


    public void goToRegisterPage() {
        registerPageLink.click();
        checkPageTitle("Register:");
    }

    public void fillRegisterationPage() {
        firstName.sendKeys("firstName");
        lastName.sendKeys("lastName");
        email.sendKeys("email.test.com");
        phone.sendKeys("0799999999");
        address1.sendKeys("address1");
        address2.sendKeys("address2");
        city.sendKeys("city");
        state.sendKeys("state");
        postalCode.sendKeys("RG1 5QC");
        selectDropDownByValue("214", countryDropDown);
        userName.sendKeys("first");
        password.sendKeys("test123");
        confirmPassword.sendKeys("test123");
    }

    public void submit() {
        submit.click();
    }


    public void userRegistered() {
        successFulRegistration.isDisplayed();
        successFulRegistration.getText().contains("first");
    }
}


