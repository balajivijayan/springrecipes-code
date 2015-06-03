package au.com.attra;

public class Battery extends Product {
	private boolean isRechargeable;

	public Battery() {
		super();
	}
	

	public Battery(String name, Double price) {
		super(name, price);
	}



	public boolean isRechargeable() {
		return isRechargeable;
	}

	public void setRechargeable(boolean isRechargeable) {
		this.isRechargeable = isRechargeable;
	}

}
