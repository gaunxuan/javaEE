package club.banyuan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/7 3:44 下午
 */

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Toy implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {

    /**
     * Qualifier 解决自动装配冲突
     */
//    @Autowired
//    @Qualifier("cat")
//    Qualifier的位置和Autowired 同时出现 可以在参数上 在构造器中 在set方法中
//    private Animal animal;

//    @Autowired
//    public Toy( @Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }

//    @Autowired
//    public void setAnimal(@Qualifier("cat") Animal animal) {
//        this.animal = animal;
//    }

//    @Autowired
//    @Qualifier("cat")
//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }

    private Animal animal;

    public Toy() {
    }

    public Toy(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    // Inject 是 javax.Inject 中的注解 和 Autowired 有一样的功能
//    @Inject
    @Resource(name = "dog")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void speak() {
        animal.speak();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TOY : afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TOY : destroy");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("TOY : setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("TOY : setBeanFactory");
    }

    @PostConstruct
    public void PostConstruct() {
        System.out.println("TOY : PostConstruct");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("TOY : PreDestroy");
    }

}
