package com.balabasciuc.events_with_spring_and_jpa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
@ComponentScan("com.balabasciuc.events_with_spring_and_jpa")
public class AppConfiguration {

    //making async event listeners
    public ApplicationEventMulticaster applicationEventMulticaster()
    {
        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster = new SimpleApplicationEventMulticaster();
        simpleApplicationEventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());

        return simpleApplicationEventMulticaster;
    }
}
