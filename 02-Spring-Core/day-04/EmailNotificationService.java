package com.example.springcore;

import org.springframework.stereotype.Component;

// @Component tells Spring:
// "Create and manage an object of this class"

@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("EMAIL sent: " + message);
    }
}
