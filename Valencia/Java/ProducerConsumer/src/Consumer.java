
public class Consumer extends Thread{
	private Cup cup;
	private int number;

	public Consumer(Cup c, int number) {
		cup = c;
		this.number = number;
	}

	public void run() {
		int value = 0;

		for (int i = 0; i < 10; i++) {

			try {
				sleep((long) (Math.random() * 200));
			} catch (InterruptedException e) {
			}

			value = cup.get();
			System.out.println("Consumer #" + this.number 
								+ " got: " + value);
		}
	}

}
