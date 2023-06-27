
public class Test {

	public static void main(String[] args) {
		
		Cup cup = new Cup(0);
		
		Waiter bob = new Waiter(cup);
		Customer steve = new Customer(cup);
		
		bob.start();
		steve.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n" + cup.getCoffee());
	}

}
