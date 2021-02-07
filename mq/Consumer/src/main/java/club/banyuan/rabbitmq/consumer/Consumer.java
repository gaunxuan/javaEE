package club.banyuan.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
@RabbitListener(queuesToDeclare = @Queue("simple_queue"))
//@RabbitListener(queues = "simple_queue")
public class Consumer {
    @RabbitHandler
    public void onMessage(String message){
        System.out.println("message : "+ message);
    }
}
