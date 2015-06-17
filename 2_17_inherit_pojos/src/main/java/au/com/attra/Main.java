package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = null;

		try {
			context = new GenericXmlApplicationContext("beans.xml");

			System.out.println("SequenceGenerator using base bean");

			SequenceGenerator sequence = context.getBean(
					"baseSequenceGenerator", SequenceGenerator.class);

			System.out.println(sequence.getSequence());
			System.out.println(sequence.getSequence());
			System.out.println(sequence.getSequence());

			System.out.println("SequenceGenerator using child bean");

			SequenceGenerator sequence1 = context.getBean("sequenceGenerator1",
					SequenceGenerator.class);

			System.out.println(sequence1.getSequence());
			System.out.println(sequence1.getSequence());
			System.out.println(sequence1.getSequence());

			System.out.println("SequenceGenerator using overriding child bean");

			SequenceGenerator sequence2 = context.getBean("sequenceGenerator2",
					SequenceGenerator.class);

			System.out.println(sequence2.getSequence());
			System.out.println(sequence2.getSequence());
			System.out.println(sequence2.getSequence());

			System.out.println("Reverse Generator");
			ReverseGenerator reverseGenerator = context.getBean(
					"reverseGenerator", ReverseGenerator.class);
			System.out.println(reverseGenerator.getInitial());

			System.out
					.println("Sequence Generator using POJO of Different Class");
			SequenceGenerator sequence3 = context.getBean("sequenceGenerator3",
					SequenceGenerator.class);
			System.out.println(sequence3.getSequence());
			System.out.println(sequence3.getSequence());
			System.out.println(sequence3.getSequence());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) context).close();
		}
	}
}
