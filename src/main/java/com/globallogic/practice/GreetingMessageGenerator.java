package com.globallogic.practice;

import java.util.Calendar;

public class GreetingMessageGenerator {

    public String generateGreetingMessage(String fullName) {
        String momentOfDay = getMomentOfDay();
        return "Good " + momentOfDay + ", " + fullName + "!";
    }

    private String getMomentOfDay() {
        int hourOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (5 <= hourOfDay && hourOfDay < 12) {
            return "morning";
        }
        if (12 <= hourOfDay && hourOfDay < 18) {
            return "afternoon";
        }
        if (18 <= hourOfDay && hourOfDay < 22) {
            return "evening";
        }
        return "night";
    }
}