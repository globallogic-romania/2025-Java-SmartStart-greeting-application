package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GreetingMessageGeneratorTest {

    @Mock
    Clock clock;

    GreetingMessageGenerator generator;

    @BeforeEach
    void setup() {
        generator = new GreetingMessageGenerator(clock);
    }

    @Test
    void goodMorningYosemiteSam() {
        // Arrange (Given)
        Mockito.when(clock.getHourOfDay()).thenReturn(8);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good morning, Yosemite Sam!", message);
        Mockito.verify(clock, Mockito.times(1)).getHourOfDay();
    }

    @Test
    void goodEveningYosemiteSam() {
        // Arrange (Given)
        Mockito.when(clock.getHourOfDay()).thenReturn(19);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good evening, Yosemite Sam!", message);
        Mockito.verify(clock, Mockito.times(1)).getHourOfDay();
    }
}