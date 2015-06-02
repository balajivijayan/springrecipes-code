package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext(
				"beans.xml");

		SequenceGenerator sequence = (SequenceGenerator) context
				.getBean("sequenceGenerator");

		// Other way have getting bean from the container.
		SequenceGenerator sequence2 = context.getBean("sequenceGenerator",
				SequenceGenerator.class);//No case is required

		System.out.println(sequence.getSequence());// 30100000A
		System.out.println(sequence.getSequence());// 30100001A
		System.out.println(sequence.getSequence());// 30100002A
		System.out.println(sequence2.getSequence());// 30100003A
		System.out.println(sequence2.getSequence());// 30100004A
		System.out.println(sequence2.getSequence());// 30100005A
	}

}
