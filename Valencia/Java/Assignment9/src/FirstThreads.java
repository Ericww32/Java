import java.util.Scanner;

public class FirstThreads {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		new Thread(
				new Runnable() {
					public void run() {
						System.out.println("in an anon inner class");
						System.out.println("in an anon inner class");
						System.out.println("in an anon inner class");
						System.out.println("in an anon inner class");
					}

				}
		).start();

//		FortuneCookie cookie1 = new FortuneCookie("You will always ", 
//				"travel to interesting places", 1000);
//		
//		FortuneCookie cookie2 = new FortuneCookie("Never expect ", 
//				"lots of money to come to you", 1200);
		
		Thread cookie1 = new Thread(new FortuneCookie("You will always ", 
				"travel to interesting places", 1000));
		
		Thread cookie2 = new Thread(new FortuneCookie("Never expect ", 
				"lots of money to come to you", 1200));
		
		cookie1.start();
		cookie2.start();
		
		cookie1.suspend();
		
//		cookie1.setPriority(Thread.MAX_PRIORITY);
//		cookie2.setPriority(Thread.MIN_PRIORITY);
		
//		try {
//			cookie1.join();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}

		Fortune MyFortuneThread = new Fortune();

		// MyFortuneThread.setDaemon(false); //Daemon or User
		// MyFortuneThread.start();

		System.out.println("Enter anything: ");
		input.next();

		System.out.println("input request was satisfied in main.");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("I slept for 2 seconds");
	}

}
