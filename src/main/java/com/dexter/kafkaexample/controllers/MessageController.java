package com.dexter.kafkaexample.controllers;

import com.dexter.kafkaexample.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/api/v1/postMessage")
    public void postMessage(@RequestBody Message request){
        kafkaTemplate.send("sathish",request.message());
    }
}
