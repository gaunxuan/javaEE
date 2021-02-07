package club.banyuan.rabbitmq.config;

import club.banyuan.rabbitmq.callback.MyConfirmCallback;
import club.banyuan.rabbitmq.callback.MyReturnCallback;
import club.banyuan.rabbitmq.callback.MyReturnsCallback;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    @Value("${spring.rabbitmq.template.mandatory}")
    private Boolean mandatory;
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory,
                                         MyConfirmCallback myConfirmCallback,
                                         MyReturnCallback myReturnCallback,
                                         MyReturnsCallback myReturnsCallback){
        RabbitTemplate rabbitTemplate = new RabbitTemplate();
        rabbitTemplate.setConnectionFactory(connectionFactory);
        rabbitTemplate.setConfirmCallback(myConfirmCallback);
//        rabbitTemplate.setReturnCallback(myReturnCallback);
        rabbitTemplate.setReturnsCallback(myReturnsCallback);
        rabbitTemplate.setMandatory(mandatory);
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        return rabbitTemplate;
    }

}
