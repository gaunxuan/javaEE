package club.banyuan.resdis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class RedisTemplateUtil {
    private StringRedisTemplate redisTemplate;
    @Autowired
    public RedisTemplateUtil(StringRedisTemplate redisTemplate){

        this.redisTemplate=redisTemplate;
    }
    public void Set(String key , String value){
        redisTemplate.opsForValue().set(key, value);
    }
    public String Get(String key){
        return redisTemplate.opsForValue().get(key);
    }
    public long lpush(String key , String element){
        return redisTemplate.opsForList().leftPush(key, element);
    }
    public String brpop(String key, Duration timeout){
        return redisTemplate.opsForList().rightPop(key,timeout);
    }
}
