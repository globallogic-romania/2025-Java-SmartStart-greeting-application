package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;

public class GreetingMessageGenerator {

    private final Clock clock;

    public GreetingMessageGenerator(Clock clock) {
        this.clock = clock;
    }

    public String generateGreetingMessage(String fullName) {
        if (fullName == null) {
            throw new InvalidNameException("full name cannot be null");
        }
        if (fullName.isEmpty()) {
            throw new InvalidNameException("full name cannot be empty");
        }
        String momentOfDay = getMomentOfDay();
        return "Good " + momentOfDay + ", " + fullName + "!";
    }

    private String getMomentOfDay() {
        int hourOfDay = clock.getHourOfDay();
        if (isBetween(hourOfDay, 5, 12)) {
            return "morning";
        }
        if (isBetween(hourOfDay, 12, 18)) {
            return "afternoon";
        }
        if (isBetween(hourOfDay, 18, 22)) {
            return "evening";
        }
        return "night";
    }

    static boolean isBetween(int givenValue, int lowerLimit, int upperLimit) {
        return (lowerLimit <= givenValue) && (givenValue < upperLimit);
    }
}