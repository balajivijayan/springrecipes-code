package au.com.attra;

public class FixedRateCalculator implements RateCalculator {

	private double rate;

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getAnnualRate() {
		return rate;
	}

	@Override
	public double getMonthlyRate() {
		// TODO Auto-generated method stub
		return rate / 12;
	}

	@Override
	public double getDailyRate() {
		// TODO Auto-generated method stub
		return rate / 365;
	}

}
