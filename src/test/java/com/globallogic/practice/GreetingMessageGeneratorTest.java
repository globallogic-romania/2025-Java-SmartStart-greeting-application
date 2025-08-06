package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GreetingMessageGeneratorTest {

    @Mock
    Clock clock;

    @InjectMocks
    GreetingMessageGenerator generator;

    @Test
    void goodMorningYosemiteSam() {
        // Arrange (Given)
        when(clock.getHourOfDay()).thenReturn(8);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good morning, Yosemite Sam!", message);
        verify(clock, times(1)).getHourOfDay();
    }

    @Test
    void goodEveningYosemiteSam() {
        // Arrange (Given)
        when(clock.getHourOfDay()).thenReturn(19);

        // Act (When)
        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        // Assert (Then)
        assertEquals("Good evening, Yosemite Sam!", message);
        verify(clock, times(1)).getHourOfDay();
    }
}