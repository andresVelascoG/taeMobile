package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebviewScreen extends MobileBaseScreen {

    @AndroidFindBy(uiAutomator = "className(\"android.webkit.WebView\")")
    private WebElement wvWebview;

    public WebviewScreen(AndroidDriver driver) {
        super(driver);
    }
    public WebElement getWvWebview() {
        return wvWebview;
    }
}
