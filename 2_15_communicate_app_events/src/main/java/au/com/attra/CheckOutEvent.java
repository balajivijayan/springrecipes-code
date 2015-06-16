package au.com.attra;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class CheckOutEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	private Date time;

	public CheckOutEvent(Object source, Date time) {
		super(source);
		this.time = time;
	}

	public Date getTime() {
		return time;
	}

}
