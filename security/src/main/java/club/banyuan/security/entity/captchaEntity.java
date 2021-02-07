package club.banyuan.security.entity;

import java.util.Random;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/21 2:16 下午
 */
public class captchaEntity {
    public static String getCaptcha(int len) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(random.nextInt(9));
        }
        return stringBuilder.toString();
    }
}