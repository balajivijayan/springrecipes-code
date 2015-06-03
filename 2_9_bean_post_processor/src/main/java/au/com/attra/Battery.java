package au.com.attra;

public class Battery extends Product {
	private boolean isRechargeable;

	public Battery() {
		super();
	}

	public Battery(String name, double price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return isRechargeable;
	}

	public void setRechargeable(boolean isRechargeable) {
		this.isRechargeable = isRechargeable;
	}

	public void init_method() {
		System.out.println("init-method of Battery bean is called");
	}

	public void destroy() {
		System.out.println("destroy-method of Battery bean is called");
	}
}
