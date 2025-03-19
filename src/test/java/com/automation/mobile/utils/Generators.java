package com.automation.mobile.utils;

import java.util.Random;

public class Generators {
    private static final String EMAIL_DOMAIN = "@globant.com";

    public static String generateRandomEmail() {
        String randomString = generateRandomString(8);
        return randomString + EMAIL_DOMAIN;
    }

    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public static String generateRandomPassword() {
        int large = 9;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < large; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}
