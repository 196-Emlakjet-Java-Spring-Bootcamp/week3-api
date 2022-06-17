package com.example.springboot.controller;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class QueueController {

    private RabbitTemplate rabbitTemplate;

    private Queue queue;
    @Autowired
    public QueueController(RabbitTemplate rabbitTemplate, Queue queue){
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }


    @PostMapping("/event")
    public String sendMessage(@RequestBody String event){
        rabbitTemplate.convertAndSend(this.queue.getName(), event);
        return "Event added.";
    }


}
