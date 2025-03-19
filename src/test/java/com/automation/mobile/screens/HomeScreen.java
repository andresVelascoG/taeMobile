package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends MobileBaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"WEBDRIVER\")")
    private WebElement lblWebDriver;

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getLblWebDriver() {
        return lblWebDriver;
    }
}
