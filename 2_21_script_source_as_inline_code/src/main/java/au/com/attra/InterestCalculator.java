package au.com.attra;

public interface InterestCalculator {
	public void setRateCalculator(RateCalculator rateCalculator);

	public double calculate(double amount, double year);
}
