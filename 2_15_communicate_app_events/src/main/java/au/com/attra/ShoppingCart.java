package au.com.attra;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> items = new ArrayList<Product>();

	public void addItems(Product item) {
		items.add(item);
	}

	public List<Product> getItems() {
		return items;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Product p : items) {
			sb.append(p.getName());
			sb.append("\t");
		}
		return sb.toString();
	}
}
