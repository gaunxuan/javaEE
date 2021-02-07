package club.banyuan.rabbitmq.consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Consumer2 {
    @RabbitListener(queuesToDeclare = @Queue("simple_queue"))
    public void onMessage(String message, Channel channel, Message msg) throws IOException {
        System.out.println("message2 : "+ message);
        long deliveryTag = msg.getMessageProperties().getDeliveryTag();
        // ack
        channel.basicAck(deliveryTag,false);
        // unack
        //channel.basicNack(deliveryTag,false,false);
        // reject
        //channel.basicReject(deliveryTag,false);
    }
}
