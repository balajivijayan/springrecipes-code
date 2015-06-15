package au.com.attra;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balaji.vijayan
 * 
 */
public class ShoppingCart {
	List<Product> items = new ArrayList<Product>();

	public List<Product> getItems() {
		return items;
	}

	public void addItems(Product item) {
		items.add(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Product p : items)
		{
		    sb.append(p.getName());
		    sb.append("\t");
		}
		return sb.toString();
	}
	
	
}
