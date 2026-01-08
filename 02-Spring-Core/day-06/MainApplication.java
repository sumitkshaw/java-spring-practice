package com.example.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(MainApplication.class, args);

        MessageService service =
                context.getBean(MessageService.class);

        service.printMessage();
    }
}
