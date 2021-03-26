package com.epam.messaging.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BookConsumer {
    @KafkaListener(topics = "testTopic", groupId = "group-id")
    public void consume(String message){
        System.out.println(message);
    }
}
