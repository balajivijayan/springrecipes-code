package au.com.attra;

public class Disc extends Product {
	private int capacity;

	public Disc() {
	}

	public Disc(String name, Double price) {
		super(name, price);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
