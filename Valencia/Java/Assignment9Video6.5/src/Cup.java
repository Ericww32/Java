
public class Cup {
	private int coffee;

	public Cup(int coffee) {
		this.coffee = coffee;
	}

	synchronized public int getCoffee() {
		return coffee;
	}

	synchronized public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	synchronized public void drink(){
		int localCoffee = coffee;
		
		localCoffee--;
		System.out.println(" sip ");
		
		try {
			Thread.sleep((long) (100 * Math.random()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		coffee = localCoffee;
	}
	
	synchronized public void pour(){
		int localCoffee = coffee;
		
		localCoffee++;
		System.out.println(" Pour ");
		
		try {
			Thread.sleep((long) (100 * Math.random()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		coffee = localCoffee;
		
	}

}
