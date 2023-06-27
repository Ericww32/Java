package dividendTest;

public class Person{

	private int shares;
	private double yearlyIncome;
	
	public Person(int shares, double yearlyIncome) {
		this.shares = shares;
		this.yearlyIncome = yearlyIncome;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	@Override
	public String toString() {
		return "Person [shares=" + shares + ", yearlyIncome=" + yearlyIncome + "]";
	}
	
}
