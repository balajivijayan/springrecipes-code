package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext(
				"beans.xml");

		Product battery = context.getBean("battery", Battery.class);
		Product cd = context.getBean("cd", Disc.class);
		Product dvd = context.getBean("dvd", Disc.class);

		ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
		cart1.addItems(battery);
		cart1.addItems(cd);
		System.out.println("Cart 1 items");
		for(Product item : cart1.getItems()) {
			System.out.println(item.getName());
		}

		ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
		cart2.addItems(dvd);
		System.out.println("Cart 2 items");
		for(Product item : cart2.getItems()) {
			System.out.println(item.getName());
		}
	}

}
