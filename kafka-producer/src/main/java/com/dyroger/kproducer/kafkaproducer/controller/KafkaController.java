package com.dyroger.kproducer.kafkaproducer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dyroger.kproducer.kafkaproducer.producer.KProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class KafkaController {
    
    @Autowired
    KProducer kProducer;

    @GetMapping("/push-message")
    public String publishMeesageToTopic(@RequestParam String message){
        kProducer.sendMessageString(message);
        return "Message post successfully";
    }
}
