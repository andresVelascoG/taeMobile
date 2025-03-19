package com.automation.mobile.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Gestures {

    public static void tap(WebElement element, AndroidDriver driver) {
        int X = (element.getSize().width / 2) + element.getRect().getX();
        int Y = (element.getSize().height / 2) + element.getRect().getY();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), X, Y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(100)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        List<Sequence> sequences = new ArrayList<>();
        sequences.add(sequence);
        driver.perform(sequences);
    }

    public static void swipeLeftElement(WebElement startElement, AndroidDriver driver) {
        int startX = startElement.getSize().width + startElement.getRect().getX() - 10;
        int startY = (startElement.getSize().height / 2) + startElement.getRect().getY();

        int swipeDistance = 400;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        boolean canSwipe = true;
            Sequence sequence = new Sequence(finger, 0)
                    .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(new Pause(finger, Duration.ofMillis(100)))
                    .addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX - swipeDistance, startY))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            // Ejecutar la acción de deslizamiento
            List<Sequence> sequences = new ArrayList<>();
            sequences.add(sequence);
            driver.perform(sequences);
    }

    public static void swipeLeftByScreen(AndroidDriver driver) {
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startX = (3 * screenWidth) / 4;
        int endX = (screenWidth) / 4;
        int startY = (3*screenHeight) / 4;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(100)))
                .addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, startY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofSeconds(1)));

        List<Sequence> sequences = new ArrayList<>();
        sequences.add(sequence);
        driver.perform(sequences);
    }

    public static void swipeUpByScreen(AndroidDriver driver) {
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startX = (screenWidth) / 2;
        int startY = (screenHeight) / 2;
        int endY = 10;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(100)))
                .addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofSeconds(1)));

        List<Sequence> sequences = new ArrayList<>();
        sequences.add(sequence);
        driver.perform(sequences);
    }
}
