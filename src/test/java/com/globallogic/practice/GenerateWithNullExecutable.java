package com.globallogic.practice;

import org.junit.jupiter.api.function.Executable;

public class GenerateWithNullExecutable implements Executable {

    private final GreetingMessageGenerator generator;

    public GenerateWithNullExecutable(GreetingMessageGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void execute() throws Throwable {
        generator.generateGreetingMessage(null);
    }
}