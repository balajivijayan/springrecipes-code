package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		
		Product battery = context.getBean("battery", Battery.class);
		Product disc = context.getBean("disc", Disc.class);
		
		
		
		System.out.println(battery);
		System.out.println(disc);
	}

}
