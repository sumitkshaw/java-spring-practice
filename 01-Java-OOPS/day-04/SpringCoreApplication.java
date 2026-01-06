package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication enables:
// - Component scanning
// - Auto-configuration
// - Configuration support

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {

        // Spring container starts here
        ApplicationContext context =
                SpringApplication.run(SpringCoreApplication.class, args);

        // Ask Spring for the bean
        NotificationManager manager =
                context.getBean(NotificationManager.class);

        manager.notifyUser("Welcome to Spring Core!");
    }
}
