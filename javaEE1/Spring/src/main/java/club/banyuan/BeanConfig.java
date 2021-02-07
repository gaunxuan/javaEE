package club.banyuan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/7 7:18 下午
 */
// 使用ComponentScan 完成扫描可以直接完成装配
@ComponentScan("club.banyuan")
// TODO 不懂
@Configuration
public class BeanConfig {

//    @Bean
//    public Cat cat(){
//        return new Cat("TOM");
//    }


//    @Bean
//    public Toy toy(Cat cat){
//        return new Toy(cat);
//    }

    @Bean(initMethod = "myInit", destroyMethod = "myDestroy")
    public Dog dog() {
        return new Dog();
    }

}
