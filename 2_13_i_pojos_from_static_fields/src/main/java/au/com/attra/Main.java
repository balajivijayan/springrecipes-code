package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		try {
			ctx = new GenericXmlApplicationContext("beans.xml");
			Product AA = ctx.getBean("aaa", Battery.class);
			Product CDR = ctx.getBean("cdr", Disc.class);

			System.out.println(AA.getName() + " " + AA.getPrice());
			System.out.println(CDR.getName() + " " + CDR.getPrice());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) ctx).close();
		}

	}
}
