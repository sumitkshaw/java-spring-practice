package com.example.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Prototype → New object every time it is requested
@Component
@Scope("prototype")
public class TaskService {

    public TaskService() {
        System.out.println("TaskService object created: " + this.hashCode());
    }

    public void executeTask() {
        System.out.println("Executing task using instance: " + this.hashCode());
    }
}
