package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;
import com.globallogic.practice.clock.FixedEveningClock;
import com.globallogic.practice.clock.FixedMorningClock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingMessageGeneratorTest {

    @Test
    void goodMorningYosemiteSam() {
        // Arrange (Given)
        Clock clock = new FixedMorningClock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good morning, Yosemite Sam!", message);
    }

    @Test
    void goodEveningYosemiteSam() {
        // Arrange (Given)
        Clock clock = new FixedEveningClock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good evening, Yosemite Sam!", message);
    }
}