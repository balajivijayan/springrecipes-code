package au.com.attra;

public class Disc extends Product{
	private int capacity;

	public Disc() {
		super();
	}

	public Disc(String name, double price) {
		super(name, price);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void init_method() {
		System.out.println("init-method of Disc bean is called");
	}
	
	public void destroy() {
		System.out.println("destroy-method of Disc bean is called");
	}
}
