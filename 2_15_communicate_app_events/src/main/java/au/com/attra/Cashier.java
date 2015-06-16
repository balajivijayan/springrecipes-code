package au.com.attra;

import java.util.Date;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Cashier implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher applicationEventPublisher;

	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void checkOut(ShoppingCart cart) {
		CheckOutEvent event = new CheckOutEvent(this, new Date());
		applicationEventPublisher.publishEvent(event);
	}

}
