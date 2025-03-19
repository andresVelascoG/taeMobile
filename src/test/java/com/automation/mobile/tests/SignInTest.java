package com.automation.mobile.tests;

import com.automation.mobile.base.MobileBaseTest;
import com.automation.mobile.screens.LoginScreen;
import com.automation.mobile.screens.NavBar;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.automation.mobile.utils.Generators.generateRandomEmail;
import static com.automation.mobile.utils.Generators.generateRandomPassword;

public class SignInTest extends MobileBaseTest {

    @Test
    public void signInTest(){
        NavBar navBar = new NavBar(driver);
        LoginScreen loginScreen = navBar.navigateLogin();
        String email = generateRandomEmail();
        String password = generateRandomPassword();
        loginScreen.signUp(email, password);
        String alertTest= loginScreen.getTextAlert();
        Assert.assertEquals(alertTest, "Signed Up!\nYou successfully signed up!", "The alert confirmation should match: "+alertTest);
    }
}
