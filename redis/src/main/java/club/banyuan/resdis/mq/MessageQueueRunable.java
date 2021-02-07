package club.banyuan.resdis.mq;


import club.banyuan.resdis.RedisTemplateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;

@Component
public class MessageQueueRunable implements Runnable {
    private static String MQ_NAME = "mq";
    private RedisTemplateUtil redisTemplateUtil;

    @Autowired
    public MessageQueueRunable(RedisTemplateUtil redisTemplateUtil) {
        this.redisTemplateUtil = redisTemplateUtil;
    }

    @Override
    public void run() {
        while (true){
            String value = redisTemplateUtil.brpop(MQ_NAME, Duration.ofSeconds(10));
            if (value==null){
                System.out.println("timeout");
                continue;
            }
            System.out.println("pop"+value);
        }
    }
    @PostConstruct
    public void startThreads(){
        new Thread(this).start();
    }
}
