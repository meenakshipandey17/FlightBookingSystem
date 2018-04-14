package com.newtours.demoaut.stepDefinitions;

import com.newtours.demoaut.util.ReadAppProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Helper {
    protected static WebDriver driver;
    protected static ReadAppProperties readAppProperties;

    @Before
    public static void setUp() {
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    private static WebDriver getDriver() {
        readAppProperties = new ReadAppProperties();
        String ChromeDriver = readAppProperties.readKey("application.properties", "CHROME_DRIVER");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ChromeDriver);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");

        return new ChromeDriver(options);
    }

}
