
public class Animal implements Runnable {
	private String name;
	private int position;
	private int speed;
	private int maxRest;
	private static boolean winner = false;

	public Animal(String name, int position, int speed, int maxRest) {
		this.name = name;
		this.position = position;
		this.speed = speed;
		this.maxRest = maxRest;
	}

	public void run() {

		while (!winner) {
			try {
				Thread.sleep((long) (maxRest * Math.random()));
				new Food();
				System.out.print(name + " is at positon " + position + "\n");
				position += speed;
			} catch (InterruptedException e) {
			}
			if (position >= 100) {
				winner = true;
				System.out.println(name + " Wins!!! WOOO!");
			}

		}
	}

}
