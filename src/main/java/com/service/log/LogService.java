package com.service.log;

import org.springframework.stereotype.Component;

@Component
public class LogService implements Loggable {

    @Override
    public void log() {
        System.out.println("log");
    }
}
