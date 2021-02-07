package club.banyuan.resdis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResdisApplicationTests {

    @Autowired
    RedisTemplateUtil redisTemplateUtil;
    @Autowired
    JedisUtil jedisUtil;
    @Test
    void contextLoads() {
        redisTemplateUtil.Set("k1","v1");
        String k1 = redisTemplateUtil.Get("k1");
        System.out.println(k1);
    }
    @Test
    void test(){
        jedisUtil.set("k2","v2");
        System.out.println(jedisUtil.get("k2"));
    }
}
