package club.banyuan.rabbitmq.produecer;

import club.banyuan.rabbitmq.entity.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer{
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public Producer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message){
        rabbitTemplate.convertAndSend("simple_queue",message);
    }
    public void sendObject(User user){
        rabbitTemplate.convertAndSend("user_queue",user);
    }
    public void sendMessage(String queue , String message){
        rabbitTemplate.convertAndSend(queue,message);
    }
    public void sendMessage(String exchange,String routingKey,String message){
        rabbitTemplate.convertAndSend(exchange,routingKey,message);
    }
}
