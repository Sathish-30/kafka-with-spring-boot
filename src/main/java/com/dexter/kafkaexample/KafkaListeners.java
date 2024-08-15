package com.dexter.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "sathish",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received "+ data);
    }
}
