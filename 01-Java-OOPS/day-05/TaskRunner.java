package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TaskRunner {

    private final ApplicationContext context;

    public TaskRunner(ApplicationContext context) {
        this.context = context;
    }

    public void runTasks() {
        TaskService t1 = context.getBean(TaskService.class);
        TaskService t2 = context.getBean(TaskService.class);

        t1.executeTask();
        t2.executeTask();
    }
}
