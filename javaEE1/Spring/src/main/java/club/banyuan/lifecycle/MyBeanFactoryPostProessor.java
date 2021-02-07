package club.banyuan.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/8 2:41 下午
 */

@Component
public class MyBeanFactoryPostProessor implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProessor() {
        System.out.println("MyBeanFactoryPostProessor new ");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProessor :postProcessBeanFactory");
    }
}
