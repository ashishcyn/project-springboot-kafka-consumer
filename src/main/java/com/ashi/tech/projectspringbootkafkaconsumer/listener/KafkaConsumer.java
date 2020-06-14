package com.ashi.tech.projectspringbootkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test-topic-1", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed message" + message);
    }
}
