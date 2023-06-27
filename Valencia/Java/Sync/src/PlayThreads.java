import java.io.IOException;

public class PlayThreads {

	public static void main(String[] args) {
		Thread betty = new Thread(new Jumble("Betty", "Davis", null));
		Thread bugs = new Thread(new Jumble("Bugs", "Bunny", null));
		
		betty.start();
		bugs.start();
		
		
		try {
			System.in.read();
			System.out.println("Main thread is ending");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
