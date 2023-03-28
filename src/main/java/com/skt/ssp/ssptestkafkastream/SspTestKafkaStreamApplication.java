package com.skt.ssp.ssptestkafkastream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SspTestKafkaStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SspTestKafkaStreamApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            while (true) {
                //kafkaTemplate.send("ssp-topic", "Hello, ssp topic 123");
                //Thread.sleep(3000l);
            }
         };
    }

}
