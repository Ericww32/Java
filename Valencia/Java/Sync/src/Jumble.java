public class Jumble implements Runnable {

	private String first;
	private String last;
	ShareData danger;

	public Jumble(String first, String last, ShareData danger) {
		this.first = first;
		this.last = last;
		this.danger = danger;
	}

	public void run() {
		
		while(true) {
			System.out.print(first + " ");
			
			danger.decrease(10);
			
			try {
				Thread.sleep((int) (1000 * Math.random()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			danger.increase(10);

			System.out.println(last);
		}
	}

}
