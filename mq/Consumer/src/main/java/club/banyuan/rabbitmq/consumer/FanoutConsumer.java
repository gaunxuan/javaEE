package club.banyuan.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutConsumer {
    @RabbitListener(queuesToDeclare = @Queue("fanout_queue1"))
    public void onMessage1(String message){
        System.out.println("fanout_queue1 ="+message);
    }
    @RabbitListener(queuesToDeclare = @Queue("fanout_queue2"))
    public void onMessage2(String message){
    }
}
