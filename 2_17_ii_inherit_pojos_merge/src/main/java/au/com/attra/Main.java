package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new GenericXmlApplicationContext("beans.xml");

			SequenceGenerator sequence = context.getBean("sequenceGenerator",
					SequenceGenerator.class);
			
			System.out.println("Sequence Generated using merged suffixes");
			System.out.println(sequence.getSequence());
			System.out.println(sequence.getSequence());
			System.out.println(sequence.getSequence());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
