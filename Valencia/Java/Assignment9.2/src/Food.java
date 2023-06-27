
public class Food extends Thread {

	public Food() {
		eat();
	}

	synchronized public void eat() {
		try {
			Thread.sleep((long) (100 * Math.random()));
			System.out.print("Inside: ");
		} catch (InterruptedException e) {
		}
	}

}
