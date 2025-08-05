package com.globallogic.practice;

public class Main {
    public static void main(String[] args) {
        String fullName = "Yosemite Sam";
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage(fullName);

        System.out.println(message);
    }
}