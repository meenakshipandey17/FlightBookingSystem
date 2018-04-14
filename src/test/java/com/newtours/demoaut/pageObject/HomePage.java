package com.newtours.demoaut.pageObject;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public String APP_URL = getAppUrl();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigatetoHomepage() {
        driver.get(APP_URL);
        checkPageTitle(": Mercury Tours");

    }


}


