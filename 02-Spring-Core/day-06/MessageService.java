package com.example.springconfig;

// Plain Java class (NOT a Spring annotation)
public class MessageService {

    private final String message;

    public MessageService(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
