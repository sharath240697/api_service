package com.sharath.exp_pipeline.api_service.ControllerService;

import com.sharath.exp_pipeline.api_service.Kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    Producer kafkaProduce;

    @GetMapping("test")
    public String Test() {
        return "The Application is up and running";
    }

    @GetMapping("publish")
    public void publish(@RequestParam("message") String message) {
        this.kafkaProduce.sendMessage(message);
    }


}
