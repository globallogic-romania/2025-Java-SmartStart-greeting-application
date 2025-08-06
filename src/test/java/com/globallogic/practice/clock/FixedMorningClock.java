package com.globallogic.practice.clock;

public class FixedMorningClock implements Clock {

    @Override
    public int getHourOfDay() {
        return 8;
    }
}