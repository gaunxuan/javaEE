package club.banyuan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/7 7:25 下午
 */
@Component
// Primary 解决自动装配冲突问题 谁加上了Primary 就使用谁
//@Primary
public class Cat implements Animal {
    @Value("TOM")
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("miaomiaomiao....");
    }
}
