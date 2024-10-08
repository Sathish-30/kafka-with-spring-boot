package com.dexter.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopiConfig {

    @Bean
    public NewTopic dexterTopic(){
        return TopicBuilder.name("sathish")
                .build();
    }
}
