package com.example.spring.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener {

    @EventListener
    public void processCustomEvent(CustomSpringEvent event) {
        System.out.println(event);
    }
}