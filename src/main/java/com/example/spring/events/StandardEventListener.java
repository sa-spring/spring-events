package com.example.spring.events;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StandardEventListener {

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent e) {
        System.out.println(e);
    }

    @EventListener
    public void handleContextStarted(ContextStartedEvent e) {
        System.out.println(e);
    }

    @EventListener
    public void handleContextClosed(ContextClosedEvent e) {
        System.out.println(e);
    }

    @EventListener
    public void handleContextStopped(ContextStoppedEvent e) {
        System.out.println(e);
    }

}