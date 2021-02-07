package club.banyuan.rabbitmq.config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {
    @Bean
    public Queue newQueue(){
        return new Queue("simple_queue",true);
    }
    @Bean
    public Queue newUserQueue(){
        return new Queue("user_queue",true);
    }
    @Bean
    public Queue directQueue1(){
        return QueueBuilder.durable("direct_queue1").build();
    }
    @Bean
    public Queue directQueue2(){
        return QueueBuilder.durable("direct_queue2").build();
    }
    @Bean
    public Exchange directExchange(){
        return new DirectExchange("direct_exchange");

    }
    @Bean
    public Binding directBinding1(Exchange directExchange,
                                 Queue directQueue1){
        return BindingBuilder.bind(directQueue1).to(directExchange).with("direct_routing_key1").noargs();
    }
    @Bean
    public Binding directBinding2(Exchange directExchange,
                                 Queue directQueue2){
        return BindingBuilder.bind(directQueue2).to(directExchange).with("direct_routing_key2").noargs();
    }

    @Bean
    public Queue fanoutQueue1(){
        return QueueBuilder.durable("fanout_queue1").build();
    }
    @Bean
    public Queue fanoutQueue2(){
        return QueueBuilder.durable("fanout_queue2").build();
    }
    @Bean
    public Exchange fanoutExchange(){
        return new FanoutExchange("fanout_exchange");

    }
    @Bean
    public Binding fanoutBinding1(Exchange fanoutExchange,
                                  Queue fanoutQueue1){
        return BindingBuilder.bind(fanoutQueue1).to(fanoutExchange).with("fanout_routing_key1").noargs();
    }
    @Bean
    public Binding fanoutBinding2(Exchange fanoutExchange,
                                  Queue fanoutQueue2){
        return BindingBuilder.bind(fanoutQueue2).to(fanoutExchange).with("fanout_routing_key2").noargs();
    }

}
