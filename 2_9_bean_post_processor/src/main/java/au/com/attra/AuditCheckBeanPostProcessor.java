package au.com.attra;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AuditCheckBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1)
			throws BeansException {
		System.out
				.println("In AuditCheckBeanPostProcessor class postProcessAfterInitialization method, processing bean type, "
						+ bean.getClass());
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out
		.println("In AuditCheckBeanPostProcessor class postProcessBeforeInitialization method, processing bean type, "
				+ bean.getClass());
		return bean;
	}

}
