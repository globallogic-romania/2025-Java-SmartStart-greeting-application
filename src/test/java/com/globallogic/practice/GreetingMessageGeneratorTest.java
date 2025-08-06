package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GreetingMessageGeneratorTest {

    @Test
    void goodMorningYosemiteSam() {
        // Arrange (Given)
        Clock clock = Mockito.mock(Clock.class);
        Mockito.when(clock.getHourOfDay()).thenReturn(8);
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
        Clock clock = Mockito.mock(Clock.class);
        Mockito.when(clock.getHourOfDay()).thenReturn(19);
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good evening, Yosemite Sam!", message);
    }
}