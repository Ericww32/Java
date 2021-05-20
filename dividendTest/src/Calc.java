package dividendTest;

import java.text.NumberFormat;

public class Calc {

	private double payback;
	private double paypot;
	private double total;

	private double quarterlyIncome;
	private double totalYearlyIncome;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	String yearInc;
	String quarterInc;
	String liquid;
	String Pay_Pot;

	public Calc() {

	}// end blank calc constructor

	public Calc(double payback, double paypot, double total, double quarterlyIncome, double totalYearlyIncome,
			NumberFormat formatter, String yearInc, String quarterInc, String liquid, String pay_Pot) {
		super();
		this.payback = payback;
		this.paypot = paypot;
		this.total = total;
		this.quarterlyIncome = quarterlyIncome;
		this.totalYearlyIncome = totalYearlyIncome;
		this.formatter = formatter;
		this.yearInc = yearInc;
		this.quarterInc = quarterInc;
		this.liquid = liquid;
		Pay_Pot = pay_Pot;
	}// end calc constructor

	public void run() {

		int year = 1;
		int quarter;
		boolean flag = true;
		Person person = new Person(0, 30000);
		Stock stock = new Stock();

		for (quarter = 1; this.payback <= 10000; quarter++) {

			this.quarterlyIncome = ((person.getYearlyIncome() * 20) / 100) / 4;

			if (year >= 3) {// saying I make it to $60k a year
				person.setYearlyIncome(60000);

				if (year == 3) {
					System.out.println("");
					System.out.println(stock.toString());
					System.out.println(person.toString());
					System.out.println("");
				}

				if (year >= 5) {// saying I make it to $80k a year
					person.setYearlyIncome(80000);
					this.quarterlyIncome = ((person.getYearlyIncome() * 50) / 100) / 4;
					
					if (year == 5) {
						System.out.println("");
						System.out.println(stock.toString());
						System.out.println(person.toString());
						System.out.println("");
					}

					if (year >= 8) {// saying I make it to $100k a year
						person.setYearlyIncome(100000);
						this.quarterlyIncome = ((person.getYearlyIncome() * 60) / 100) / 4;
						
						if (year == 8) {
							System.out.println("");
							System.out.println(stock.toString());
							System.out.println(person.toString());
							System.out.println("");
						}

						if (year >= 10) {// saying I make it to $120k a year
							person.setYearlyIncome(120000);
							this.quarterlyIncome = ((person.getYearlyIncome() * 80) / 100) / 4;

							while (flag) {
								person.setShares(person.getShares() * 2);
								stock.setStockPrice(stock.getStockPrice() / 2);
								flag = false;
							}
							
							if (year == 10) {
								System.out.println("");
								System.out.println(stock.toString());
								System.out.println(person.toString());
								System.out.println("");
							}
						}
					}
				}
			}

			this.total = this.quarterlyIncome + this.payback;
			int tempValue = (int) (this.total / stock.getStockPrice());
			person.setShares(person.getShares() + tempValue);
			this.payback = person.getShares() * stock.getDividend();
			this.paypot += this.payback;
			this.totalYearlyIncome = person.getYearlyIncome() + (this.payback * 4);

			if (quarter == 4) {
				System.out.println("At the end of year " + year + " you are at $" + Math.round(this.payback));

				this.yearInc = formatter.format(this.totalYearlyIncome);
				System.out.println("Total yearly salary: " + this.yearInc);

				year++;
				quarter = 0;
				stock.setDividend(stock.getDividend() + .01);
				stock.setStockPrice(stock.getStockPrice() + 2);
				System.out.println("*************************************************");

			} else {
				System.out.println(
						"At quarter " + quarter + " of year " + year + " you are at $" + Math.round(this.payback));
			}
		} // end for loop

		System.out.println("*************************************************");

		System.out.println(stock.toString());
		System.out.println(person.toString());

		this.quarterInc = formatter.format(this.quarterlyIncome);
		this.liquid = formatter.format(stock.getStockPrice() * person.getShares());
		this.Pay_Pot = formatter.format(this.paypot);
		this.yearInc = formatter.format(this.totalYearlyIncome);

		System.out.println("\nIt takes " + year + " years and " + ((quarter - 1) * 3) + " months");
		System.out.println("Yearly Income \t\t" + yearInc);
		System.out.println("Shares: \t\t" + person.getShares());
		System.out.println("Stock Price: \t\t" + stock.getStockPrice());
		System.out.println("Liquidation value: \t" + liquid);
		System.out.println("Dividend: \t\t$" + Math.floor(stock.getDividend() * 100) / 100);
		System.out.println("Quarterly pay: \t\t" + quarterInc);
		System.out.println("Pay/Dividend quarter: \t" + formatter.format(this.payback));
		System.out.println("Pay Pot: \t\t" + Pay_Pot);
	}// end run
}// end calc class
