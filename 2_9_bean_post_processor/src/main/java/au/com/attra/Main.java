package au.com.attra;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
		System.out.println("Context Created");
		Battery battery = ctx.getBean("aa", Battery.class);
		System.out.println("Bean retrieved");
		System.out.println(battery.getName() + battery.getPrice() + battery.isRechargeable());
		System.out.println(new Integer(20).getClass().getSimpleName());
		System.out.println(battery instanceof Battery);
		//Bean will be destroyed only after a call to destroy method.
		//Bean should be of the type AbstractApplicationContext.
		ctx.destroy();
		ctx.close();
	}

}
