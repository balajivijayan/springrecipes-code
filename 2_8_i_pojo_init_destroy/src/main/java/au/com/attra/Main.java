package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext(
				"beans.xml");

		Product battery = context.getBean("battery", Battery.class);
		Product cd = context.getBean("cd", Disc.class);
		Product dvdrw = (Product) context.getBean("dvd");

		ShoppingCart cart1 = context
				.getBean("shoppingCart", ShoppingCart.class);
		cart1.addItems(battery);
		cart1.addItems(cd);
		System.out.println("Shopping cart 1 contains");
		for(Product item: cart1.getItems()) {
			System.out.println(item.getName());
		}

		ShoppingCart cart2 = context
				.getBean("shoppingCart", ShoppingCart.class);
		cart2.addItems(dvdrw);
		System.out.println("Shopping cart 2 contains");
		for(Product item: cart2.getItems()) {
			System.out.println(item.getName());
		
		}

		Cashier cashier = context.getBean("cashier", Cashier.class);
		cashier.checkOut(cart1);
		cashier.checkOut(cart2);
	}

}
