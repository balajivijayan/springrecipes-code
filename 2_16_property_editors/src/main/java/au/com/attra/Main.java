package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new GenericXmlApplicationContext("beansPropertyEditor.xml");

			Product bestSeller = (Product) context.getBean("bestSeller");
			System.out.println("Best seller is: " + bestSeller.getName());

			ProductRanking productRanking = (ProductRanking) context
					.getBean("productRanking");
			System.out.println("Product ranking from "
					+ productRanking.getFromDate() + " to "
					+ productRanking.getToDate());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) context).close();
		}
	}

}
