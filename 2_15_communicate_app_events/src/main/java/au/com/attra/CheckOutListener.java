package au.com.attra;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CheckOutListener implements ApplicationListener<ApplicationEvent>{


	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof CheckOutEvent) {
			System.out.println("Checkout time " + ((CheckOutEvent) event).getTime());
		}
		
	}

}
