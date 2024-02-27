package com.dyroger.kproducer.kafkaproducer.producer;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KProducer {

    @Value("${input.topic}")
    String inputTopic;

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageString(String messageString) {
        // CompletableFuture<SendResult<String, String>>  completableFuture = 
        kafkaTemplate.send("inputTopic", messageString);
        
    }
}
