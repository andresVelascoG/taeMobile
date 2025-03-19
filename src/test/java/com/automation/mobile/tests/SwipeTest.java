package com.automation.mobile.tests;

import com.automation.mobile.base.MobileBaseTest;
import com.automation.mobile.screens.LoginScreen;
import com.automation.mobile.screens.NavBar;
import com.automation.mobile.screens.SwipeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.automation.mobile.utils.Generators.generateRandomEmail;
import static com.automation.mobile.utils.Generators.generateRandomPassword;

public class SwipeTest extends MobileBaseTest {
    @Test
    public void swipeHorizontalTest(){
        NavBar navBar = new NavBar(driver);
        SwipeScreen swipeScreen = navBar.navigateSwipe();
        swipeScreen.scrollCardsEnd();
        Assert.assertTrue(swipeScreen.isItem5Visible(), "The last item should be visible");
        Assert.assertFalse(swipeScreen.isItem4Visible(),"The 4 item shouldn't be visible");
    }

    @Test
    public void swipeVerticalTest(){
        NavBar navBar = new NavBar(driver);
        SwipeScreen swipeScreen = navBar.navigateSwipe();
        swipeScreen.scrollViewEnd();
        Assert.assertTrue(swipeScreen.isFoundElementVisible(), "The last item should be visible");
    }
}
