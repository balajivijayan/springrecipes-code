package au.com.attra;

public abstract class Product {
	private String name;
	private double price;
	public static final Product AAA = new Battery("AAA", 10.0);
	public static final Disc CDR = new Disc("CD-R", 15.0);

	public Product() {
		super();
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
