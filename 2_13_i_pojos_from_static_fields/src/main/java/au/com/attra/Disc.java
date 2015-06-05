package au.com.attra;

public class Disc extends Product {
	private double capacity;

	public Disc() {
		super();
	}

	public Disc(String name, double price) {
		super(name, price);
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
