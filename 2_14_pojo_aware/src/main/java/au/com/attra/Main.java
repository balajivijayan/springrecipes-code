package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new GenericXmlApplicationContext("beans.xml");

			Product aaa = context.getBean("aaa", Battery.class);
			Product cdr = context.getBean("cdr", Disc.class);
			ShoppingCart cart = context.getBean("cart", ShoppingCart.class);
			cart.addItems(aaa);
			cart.addItems(cdr);

			System.out.println("Cart one contains " + cart.toString());

			Product dvdr = context.getBean("dvdr", Disc.class);
			ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
			cart2.addItems(dvdr);

			System.out.println("Cart two contains " + cart2.toString());
			
			Cashier cashier = (Cashier) context.getBean("cashier");
			cashier.checkOutFile(cart);
			cashier.checkOutFile(cart2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
