package club.banyuan.rabbitmq.controller;

import club.banyuan.rabbitmq.entity.User;
import club.banyuan.rabbitmq.produecer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rabbitMqController {
    private Producer producer;

    @Autowired
    public rabbitMqController(Producer producer) {
        this.producer = producer;
    }
    @GetMapping("sendMessage")
    public String sendMessage(String message){
        producer.sendMessage(message);
        return message;
    }
    @GetMapping("sendUser")
    public String sendUser(User user){
        producer.sendObject(user);
        return user.toString();
    }
    @GetMapping("returncallback")
    public String returnCallback(String queue,String message){
        producer.sendMessage(queue, message);
        return message;
    }

    @GetMapping("/direct1")
    public String direct1(String message){
        producer.sendMessage("direct_exchange","direct_routing_key1",message);
        return message;
    }
    @GetMapping("/direct2")
    public String direct2(String message){
        producer.sendMessage("direct_exchange","direct_routing_key2",message);
        return message;
    }

    @GetMapping("/fanout1")
    public String fanout1(String message){
        producer.sendMessage("fanout_exchange","fanout_routing_key1",message);
        return message;
    }
    @GetMapping("/fanout2")
    public String fanout2(String message){
        producer.sendMessage("fanout_exchange","fanout_routing",message);
        return message;
    }
}
