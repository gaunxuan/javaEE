package club.banyuan;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testBeanConfig() {
        final AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(BeanConfig.class);
//        final Animal bean =(Animal) acac.getBean("dog");
//        bean.speak();
//
//        final Cat cat = (Cat)acac.getBean("cat");
//        System.out.println(cat.getName());

        final Toy toy = (Toy) acac.getBean("toy");
        toy.speak();

        acac.registerShutdownHook();
    }

    @Test
    public void testXml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Toy toy = (Toy) applicationContext.getBean("TOY");
        toy.speak();
        // 能运行是因为配置中扫描了包 完成了装配 去掉扫描将导致运行失败
        Toy toy2 = (Toy) applicationContext.getBean("toy");
        toy2.speak();
    }
}
