package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends MobileBaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Drag and Drop\")")
    private WebElement lblDragTitle;

    public DragScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getLblDragTitle() {
        return lblDragTitle;
    }
}
