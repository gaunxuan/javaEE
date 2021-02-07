package club.banyuan;

import org.example.RandomInt;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/22 10:53 上午
 */
public class Demo {
    public static void main(String[] args) {
        final RandomInt random = new RandomInt();
        System.out.println(random.randomInt(20, 10));
    }
}
