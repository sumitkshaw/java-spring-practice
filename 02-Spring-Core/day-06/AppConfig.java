package com.example.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration tells Spring:
// "This class contains bean definitions"

@Configuration
public class AppConfig {

    // @Bean tells Spring:
    // "Manage the returned object as a Spring Bean"
    @Bean
    public MessageService messageService() {
        return new MessageService("Hello from @Bean config");
    }
}
