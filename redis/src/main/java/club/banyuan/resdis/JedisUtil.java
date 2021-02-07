package club.banyuan.resdis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisUtil {
    private JedisPool jedisPool;
    @Autowired
    public JedisUtil(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
    public void set(String key ,String value){
        try(Jedis jedis = jedisPool.getResource()){
            jedis.set(key, value);
        }
    }
    public String get(String key){
        try(Jedis jedis = jedisPool.getResource()){
            return jedis.get(key);
        }
    }
}
