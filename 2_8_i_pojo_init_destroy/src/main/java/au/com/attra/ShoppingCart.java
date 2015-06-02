package au.com.attra;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> items = new ArrayList<Product>();
	
	public void addItems(Product product) {
		items.add(product);
	}
	
	public List<Product> getItems() {
		return items;
	}
}
