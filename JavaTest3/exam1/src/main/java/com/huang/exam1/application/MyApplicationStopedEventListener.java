package com.huang.exam1.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;


@Component
public class MyApplicationStopedEventListener implements ApplicationListener<ContextStoppedEvent> {

    private Logger logger = LoggerFactory.getLogger(MyApplicationStopedEventListener.class);


    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        logger.info("________________stop_____________");

    }
}
