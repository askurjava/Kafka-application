package com.epam.messaging.controller;

import com.epam.messaging.model.Book;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final KafkaTemplate<String, Book> kafkaTemplate;

    public BookController(KafkaTemplate<String, Book> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody final Book book) {
        kafkaTemplate.send("testTopic", book);
        return "Published Successfully :)";
    }
}

