package com.automation.mobile.screens;

import com.automation.mobile.base.MobileBaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static com.automation.mobile.utils.Gestures.*;

public class SwipeScreen extends MobileBaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Swipe horizontal\")")
    private WebElement lblSwipeTitle;

    @AndroidFindBy(id = "__CAROUSEL_ITEM_0_READY__")
    private WebElement carrousel0;

    @AndroidFindBy(id = "__CAROUSEL_ITEM_1_READY__")
    private WebElement carrousel1;

    @AndroidFindBy(id = "__CAROUSEL_ITEM_1_READY__")
    private WebElement carrousel2;

    @AndroidFindBy(id = "__CAROUSEL_ITEM_3_READY__")
    private WebElement carrousel3;

    @AndroidFindBy(uiAutomator = "text(\"EXTENDABLE\")")
    private WebElement carrousel4Title;

    @AndroidFindBy(uiAutomator = "text(\"COMPATIBLE\")")
    private WebElement carrousel5Title;

    @AndroidFindBy(uiAutomator = "text(\"You found me!!!\")")
    private WebElement foundElement;


    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getLblSwipeTitle() {
        return lblSwipeTitle;
    }

    public void scrollCardsEnd (){
        for (int i =0; i<5;i++) {
            swipeLeftByScreen(driver);
        }
    }

    public boolean isItem5Visible(){
        return isTheElementVisible(carrousel5Title, 5);
    }

    public boolean isItem4Visible(){
        return isTheElementVisible(carrousel4Title, 2);
    }

    public boolean isFoundElementVisible(){
        return isTheElementVisible(foundElement, 2);
    }

    public void scrollViewEnd(){
        for(int i = 0; i<3;i++){
            swipeUpByScreen(driver);
            if(isFoundElementVisible()){
                break;
            }
        }
    }
}
