package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");

		Product aaa = (Product) context.getBean("aaa");
		
		System.out.println(aaa.getName());
	}

}
