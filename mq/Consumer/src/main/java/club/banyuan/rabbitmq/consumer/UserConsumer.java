package club.banyuan.rabbitmq.consumer;

import club.banyuan.rabbitmq.entity.User;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UserConsumer {
    @RabbitListener(queuesToDeclare = @Queue("user_queue"))
    public void onMessage(User user, Channel channel, Message msg) throws IOException {
        System.out.println("userConsumer : "+ user.toString());
        long deliveryTag = msg.getMessageProperties().getDeliveryTag();
        // ack
        channel.basicAck(deliveryTag,false);
    }
}
