package dividendTest;

public class Stock {

	private double dividend;
	private double stockPrice;
	private float yield;
	
	public Stock(){
		
	}

	public Stock(double stockPrice){
		this.stockPrice = stockPrice;
	}
	
	public Stock(double stockPrice, float yeild){
		this.stockPrice = stockPrice;
	}
	
	public Stock(double dividend, double stockPrice) {
		this.dividend = dividend;
		this.stockPrice = stockPrice;
	}
	
	public Stock(double dividend, double stockPrice, float yield) {
		this.dividend = dividend;
		this.stockPrice = stockPrice;
		this.yield = yield;
	}

	public double getDividend() {
		return dividend;
	}

	public void setDividend(double dividend) {
		this.dividend = dividend;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public float getYield() {
		return yield;
	}

	public void setYield(float yield) {
		this.yield = yield;
		yield *= 100;
	}
	
	public void calcDivFromYield(){
		double div = getDividend();
		double stockPrice = getStockPrice();
		float yield = getYield();
		
		this.dividend = div;
		this.yield = yield;
		this.stockPrice = stockPrice;
		
		div = (yield * stockPrice) / 4;
		
		setDividend(div);
	}

	@Override
	public String toString() {
		return "Stock [dividend: " + dividend + ", stockPrice: " 
						+ stockPrice + ", Yield: " + yield + "]";
	}

}
