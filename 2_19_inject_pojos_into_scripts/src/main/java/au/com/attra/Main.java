package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = null;

		try {
			context = new GenericXmlApplicationContext("beans.xml");

			InterestCalculator calculator = (InterestCalculator) context
					.getBean("interestCalculator");
			System.out.println(calculator.calculate(100000, 1));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) context).close();
		}
	}

}
