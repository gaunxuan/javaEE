package club.banyuan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/8 10:21 上午
 */
//@Component
//@Primary
public class Dog implements Animal {
    @Value("jiwawa")
    private String name;

    public Dog() {
    }

    public Dog(String name) {
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
        System.out.println("wangwangwang...");
    }

    private void myInit() {
        System.out.println("Dog : init");
    }

    private void myDestroy() {
        System.out.println("Dog : destroy");
    }
}
