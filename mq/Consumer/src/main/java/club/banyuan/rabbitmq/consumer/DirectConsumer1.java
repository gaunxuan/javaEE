package club.banyuan.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DirectConsumer1 {
    @RabbitListener(queuesToDeclare = @Queue("direct_queue1"))
    public void onMessage1(String message){
        System.out.println("direct_queue1 ="+message);
    }
    @RabbitListener(queuesToDeclare = @Queue("direct_queue2"))
    public void onMessage2(String message){
        System.out.println("direct_queue2 ="+message);
    }
}
