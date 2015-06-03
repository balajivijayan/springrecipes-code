package au.com.attra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext(
				"beans.xml");

		SequenceGeneratorList seqGeneratorList = context.getBean(
				"sequenceGenerator", SequenceGeneratorList.class);
		SequenceGeneratorSet sequenceGeneratorSet = context.getBean(
				"sequenceGeneratorSet", SequenceGeneratorSet.class);
		SequenceGeneratorMap sequenceGeneratorMap = context.getBean(
				"sequenceGeneratorMap", SequenceGeneratorMap.class);
		SequenceGeneratorProp sequenceGeneratorProp = context.getBean(
				"sequenceGeneratorProp", SequenceGeneratorProp.class);

		System.out.println("Sequence Using List");
		System.out.println(seqGeneratorList.getSequence());
		System.out.println(seqGeneratorList.getSequence());

		System.out.println("Sequence Using Set");
		System.out.println(sequenceGeneratorSet.getSequence());
		System.out.println(sequenceGeneratorSet.getSequence());

		// URL url = new URL(protocol, host, file);
		System.out.println("Sequence Using Map");
		System.out.println(sequenceGeneratorMap.getSequence());
		System.out.println(sequenceGeneratorMap.getSequence());
		
		System.out.println("Sequence Using Prop");
		System.out.println(sequenceGeneratorProp.getSequence());
		System.out.println(sequenceGeneratorProp.getSequence());
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
