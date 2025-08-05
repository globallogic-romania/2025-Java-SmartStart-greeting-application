package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;
import com.globallogic.practice.clock.InternalClock;

public class Main {
    public static void main(String[] args) {
        Clock clock = new InternalClock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);

        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        System.out.println(message);
    }
}