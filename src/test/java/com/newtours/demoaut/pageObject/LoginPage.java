package com.newtours.demoaut.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy ( name = "userName" )
    public WebElement username;

    @FindBy ( name = "password" )
    public WebElement password;

    @FindBy ( name = "login" )
    public WebElement login;

    @FindBy ( linkText = "registration form" )
    public WebElement registrationFormLink;

    public void fill_username_password(String user, String pwd) {
        username.sendKeys(user);
        password.sendKeys(pwd);

    }

    public void submit() {
        login.click();

    }

    public void registerPage() {
        checkPageTitle("Sign-on:");
        Assert.assertTrue(registrationFormLink.isDisplayed());
    }

}


