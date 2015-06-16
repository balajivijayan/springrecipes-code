package au.com.attra;

import java.util.Date;

public class ProductRanking {
	private Product bestSeller;
	private Date toDate;
	private Date fromDate;

	public ProductRanking() {
		super();
	}

	public Product getBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(Product bestSeller) {
		this.bestSeller = bestSeller;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

}
