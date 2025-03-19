package com.automation.mobile.tests;

import com.automation.mobile.base.MobileBaseTest;
import com.automation.mobile.screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends MobileBaseTest {

    @Test
    public void navigationTest(){
        NavBar navBar = new NavBar(driver);
        HomeScreen homeScreen= navBar.navigateHome();
        Assert.assertTrue(homeScreen.isTheElementVisible(homeScreen.getLblWebDriver(), 5),"The title of the Home screen should be displayed");
        WebviewScreen webviewScreen = navBar.navigateWebview();
        Assert.assertTrue(webviewScreen.isTheElementVisible(webviewScreen.getWvWebview(), 20), "The WebView of the WebView screen should be displayed");
        LoginScreen loginScreen = navBar.navigateLogin();
        Assert.assertTrue(loginScreen.isTheElementVisible(loginScreen.getLblLoginTitle(), 5), "The title of the Login screen should be displayed");
        FormsScreen formsScreen = navBar.navigateForms();
        Assert.assertTrue(formsScreen.isTheElementVisible(formsScreen.getLblFormTitle(), 5), "The title of the Form screen should be displayed");
        SwipeScreen swipeScreen = navBar.navigateSwipe();
        Assert.assertTrue(swipeScreen.isTheElementVisible(swipeScreen.getLblSwipeTitle(), 5), "The title of the Swipe screen should be displayed");
        DragScreen dragScreen = navBar.navigateDrag();
        Assert.assertTrue(dragScreen.isTheElementVisible(dragScreen.getLblDragTitle(), 5), "The title of the Drag screen should be displayed");
    }
}
