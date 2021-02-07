package club.banyuan.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version 1.0
 * @date 2021/1/8 2:50 下午
 */

@Component
public class MyInstantiationAwareBeanPostProcessorAdapter extends InstantiationAwareBeanPostProcessorAdapter {

    public MyInstantiationAwareBeanPostProcessorAdapter() {
        System.out.println("MyInstantiationAwareBeanPostProcessorAdapter : new ");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessorAdapter : postProcessBeforeInstantiation ----" + beanName);
        return super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessorAdapter : postProcessAfterInstantiation ----" + beanName);
        return super.postProcessAfterInstantiation(bean, beanName);
    }
}
