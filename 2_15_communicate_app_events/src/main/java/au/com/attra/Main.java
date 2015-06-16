package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context = null;
		try {
			context = new GenericXmlApplicationContext("beans.xml");

			Product aaa = context.getBean("aaa", Battery.class);
			Product cdr = context.getBean("cdr", Disc.class);
			Product dvdr = context.getBean("dvdr", Disc.class);

			ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
			cart1.addItems(aaa);
			cart1.addItems(cdr);

			System.out.println("Shopping cart 1 contains " + cart1.toString());

			ShoppingCart cart2 = (ShoppingCart) context.getBean("cart");
			cart2.addItems(dvdr);
			System.out.println("Shopping cart 2 contains " + cart2.toString());

			Cashier cashier = context.getBean("cashier", Cashier.class);
			cashier.checkOut(cart1);
			cashier.checkOut(cart2);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) context).close();
		}
	}
}
