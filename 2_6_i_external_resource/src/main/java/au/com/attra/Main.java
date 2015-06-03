package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");

		Battery battery = ctx.getBean("battery", Battery.class);

		System.out.println(battery.getName());
		System.out.println(battery.getPrice());
		System.out.println(battery.isRechargeable());
		System.out.println(battery.getDiscount());

	}

}
