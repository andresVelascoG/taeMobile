package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends MobileBaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Form components\")")
    private WebElement lblFormTitle;

    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getLblFormTitle() {
        return lblFormTitle;
    }
}
