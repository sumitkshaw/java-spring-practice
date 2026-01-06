package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Spring will create this object too
@Component
public class NotificationManager {

    private final NotificationService notificationService;

    // Constructor Injection (BEST PRACTICE)
    @Autowired
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String msg) {
        notificationService.send(msg);
    }
}
