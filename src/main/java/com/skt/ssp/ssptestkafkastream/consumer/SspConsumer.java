package com.skt.ssp.ssptestkafkastream.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SspConsumer {
    @KafkaListener(id = "ssp-to-listener", topics = "ssp-topic-to")
    public void listen(String message) {
        System.out.println("Listener to producer :::: , message =" + message);
    }
}
