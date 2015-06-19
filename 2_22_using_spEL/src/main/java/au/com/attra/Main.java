package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/**
 * @author balaji.vijayan
 *
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		try {
			context = new GenericXmlApplicationContext("beans.xml");
			CommonData common = context.getBean("commonData", CommonData.class);
			
			common.getCommonProperties().list(System.out);
			System.out.println(common.getUserOS());
			System.out.println(common.getUserRegion());
			System.out.println(common.getRandomNumber());
			System.out.println(common.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
