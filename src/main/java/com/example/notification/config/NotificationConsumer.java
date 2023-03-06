package com.example.notification.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(AmqpRequest amqpRequest){
        System.out.println(" payload :"+amqpRequest.getPayload());
    }
}
