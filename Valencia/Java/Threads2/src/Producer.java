
public class Producer extends Thread{
	private Cup cup;
	private int number;

	public Producer(Cup c, int number) {
		cup = c;
		this.number = number;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			cup.put(i);

			System.out.println("Producer #" + this.number + " puts: " + i);

			try {
				sleep((long) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
