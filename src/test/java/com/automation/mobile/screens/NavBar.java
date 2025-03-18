package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavBar extends MobileBaseScreen {

    @AndroidFindBy(accessibility = "Home")
    private WebElement btnHome;
    @AndroidFindBy(accessibility = "Webview")
    private WebElement btnWebview;
    @AndroidFindBy(accessibility = "Login")
    private WebElement btnLogin;
    @AndroidFindBy(accessibility = "Forms")
    private WebElement btnforms;
    @AndroidFindBy(accessibility = "Swipe")
    private WebElement btnSwipe;
    @AndroidFindBy(accessibility = "Drag")
    private WebElement btnDrag;

    public NavBar(AndroidDriver driver){
        super(driver);
    }

    public HomeScreen navigateHome(){
        btnHome.click();
        return new HomeScreen(driver);
    }

}
