package com.automation.mobile.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MobileBaseTest {

    protected static AndroidDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = createAndroidDriver();
    }

    @AfterMethod
    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }

    private AndroidDriver createAndroidDriver(){
        URL url = null;
        try{
            url = new URL("http://127.0.0.1:4723");

            UiAutomator2Options options = new UiAutomator2Options()
                    .setApp("/Users/andres.velasco/Documents/android.wdio.native.app.v1.0.8.apk")
                    .setDeviceName("Medium Phone API 35")
                    .setPlatformName("Android")
                    .setPlatformVersion("15");
            //.setAppActivity("");

            AndroidDriver androidDriver = new AndroidDriver(url, options);
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return androidDriver;

        }catch (MalformedURLException e){
            throw new RuntimeException(e);

        }

    }


}
