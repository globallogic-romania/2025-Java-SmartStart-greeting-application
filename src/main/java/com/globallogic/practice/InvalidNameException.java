package com.globallogic.practice;

public class InvalidNameException extends RuntimeException {
    private final String name;

    public InvalidNameException(String message) {
        this(message, null);
    }

    public InvalidNameException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}