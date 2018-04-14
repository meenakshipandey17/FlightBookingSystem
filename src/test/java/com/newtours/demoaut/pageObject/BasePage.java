package com.newtours.demoaut.pageObject;

import com.newtours.demoaut.util.ReadAppProperties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected String getAppUrl() {
        ReadAppProperties readAppProperties = new ReadAppProperties();
        return readAppProperties.readKey("application.properties", "URL");
    }


    protected void selectDropDownByValue(String value, WebElement webElement) {
        Select dropDown = new Select(webElement);
        dropDown.selectByValue(value);
    }

    protected void selectDropDownByText(String value, WebElement webElement) {
        Select dropDown = new Select(webElement);
        dropDown.selectByVisibleText(value);
    }

    protected void selectRadioButton(WebElement webElement) {
        webElement.click();
        Assert.assertTrue(webElement.isSelected());
    }

    protected void checkPageTitle(String titleText) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(titleText));
    }

}
