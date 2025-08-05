package com.globallogic.practice;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);

        String fullName = "Yosemite Sam";
        String message = generator.generateGreetingMessage(fullName);

        System.out.println(message);
    }
}