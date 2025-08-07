package com.globallogic.practice;

import com.globallogic.practice.clock.Clock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        String message = generator.generateGreetingMessage("Yosemite Sam");

        // Assert (Then)
        assertEquals("Good morning, Yosemite Sam!", message);
        verify(clock).getHourOfDay();
    }

    @Test
    void goodAfternoonYosemiteSam() {
        // Arrange (Given)
        when(clock.getHourOfDay()).thenReturn(16);

        // Act (When)
        String message = generator.generateGreetingMessage("Yosemite Sam");

        // Assert (Then)
        assertEquals("Good afternoon, Yosemite Sam!", message);
        verify(clock).getHourOfDay();
    }

    @Test
    void goodEveningYosemiteSam() {
        // Arrange (Given)
        when(clock.getHourOfDay()).thenReturn(19);

        // Act (When)
        String message = generator.generateGreetingMessage("Yosemite Sam");

        // Assert (Then)
        assertEquals("Good evening, Yosemite Sam!", message);
        verify(clock).getHourOfDay();
    }

    @Test
    void goodNightYosemiteSam() {
        // Arrange (Given)
        when(clock.getHourOfDay()).thenReturn(23);

        // Act (When)
        String message = generator.generateGreetingMessage("Yosemite Sam");

        // Assert (Then)
        assertEquals("Good night, Yosemite Sam!", message);
        verify(clock).getHourOfDay();
    }

    @Test
    void isBetween() {
        assertTrue(GreetingMessageGenerator.isBetween(10, 9, 11));
        assertTrue(GreetingMessageGenerator.isBetween(10, 10, 11));
        assertFalse(GreetingMessageGenerator.isBetween(11, 10, 11));
        assertFalse(GreetingMessageGenerator.isBetween(8, 10, 11));
        assertFalse(GreetingMessageGenerator.isBetween(12, 10, 11));
    }

    @Test
    void generateGreetingMessageWhenFullNameIsNull() {
        var exception = assertThrows(NullPointerException.class, () -> generator.generateGreetingMessage(null));
        assertEquals("full name cannot be null", exception.getMessage());
    }

    @Test
    void generateGreetingMessageWhenFullNameIsEmpty() {
        var exception = assertThrows(IllegalArgumentException.class, () -> generator.generateGreetingMessage(""));
        assertEquals("full name cannot be empty", exception.getMessage());
    }
}