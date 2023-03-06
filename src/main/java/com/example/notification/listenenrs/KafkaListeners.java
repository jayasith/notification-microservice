package com.example.notification.listenenrs;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "notification",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println(data);
    }
}
