package au.com.attra;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();

		// /Loading the profile summer
		System.out.println("Loading Summer Profiles");
		context.getEnvironment().setActiveProfiles("summer");
		context.load("beans.xml");
		context.refresh();

		Battery aaa = context.getBean("aaa", Battery.class);
		Disc cd = context.getBean("cd-r", Disc.class);
		System.out.println(aaa.getName() + " battery price in summer "
				+ aaa.getPrice());
		System.out.println(cd.getName() + " cd price in summer "
				+ cd.getPrice());

		System.out.println("Loading Winter Profiles");
		context.getEnvironment().setActiveProfiles("winter");
		context.load("beans.xml");
		Battery aaa2 = context.getBean("aaa", Battery.class);
		Disc cd2 = context.getBean("cd-r", Disc.class);
		// context.refresh();
		System.out.println(aaa2.getName() + " battery price in winter "
				+ aaa2.getPrice());
		System.out.println(cd2.getName() + " cd price in winter "
				+ cd2.getPrice());

	}

}
