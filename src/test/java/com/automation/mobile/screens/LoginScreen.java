package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static com.automation.mobile.utils.Gestures.tap;

public class LoginScreen extends MobileBaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Login / Sign up Form\")")
    private WebElement lblLoginTitle;

    @AndroidFindBy(uiAutomator = "text(\"Sign up\")")
    private WebElement lblSignUp;

    @AndroidFindBy(uiAutomator = "text(\"Login\")")
    private WebElement lblLogin;

    @AndroidFindBy(accessibility = "input-email")
    private WebElement txtEmail;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement txtPassword;

    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement txtRepeatPassword;

    @AndroidFindBy(accessibility = "button-SIGN UP")
    private WebElement btnSignUp;

    @AndroidFindBy(accessibility = "button-LOGIN")
    private WebElement btnLogin;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getLblLoginTitle() {
        return lblLoginTitle;
    }

    public void signUp(String user, String password){
        tap(lblSignUp, driver);
        txtEmail.sendKeys(user);
        txtPassword.sendKeys(password);
        txtRepeatPassword.sendKeys(password);
        btnSignUp.click();
    }

    public void logIn(String user, String password){
        tap(lblLogin, driver);
        txtEmail.sendKeys(user);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }

}
