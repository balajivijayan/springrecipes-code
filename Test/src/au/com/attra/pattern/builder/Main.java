package au.com.attra.pattern.builder;

import au.com.attra.pattern.builder.User.UserBuilder;

public class Main {
	public static void main(String args[]) {
		User user = new UserBuilder("Balaji", "Vijayan").age(24)
				.address("Chennai").phone("9840654971").build();
		
		System.out.println(user.toString());
	}
}
