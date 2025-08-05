package com.globallogic.practice;

public class GreetingMessageGenerator {
    public String generateGreetingMessage(String fullName) {
        String momentOfDay = "evenimg";
        return "Good " + momentOfDay + ", " + fullName + "!";
    }
}