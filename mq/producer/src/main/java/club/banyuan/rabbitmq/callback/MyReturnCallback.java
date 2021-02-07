package club.banyuan.rabbitmq.callback;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyReturnCallback implements RabbitTemplate.ReturnCallback {
    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("MyReturnCallback : message = " + new String(message.getBody()) + ", replyCode = " + i + ", replyText = " + s
                + ", exchange = " + s1 + ", routingKey = " + s2);
    }
}
