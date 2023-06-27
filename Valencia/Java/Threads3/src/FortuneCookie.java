
public class FortuneCookie implements Runnable {
	private String first;
	private String last;
	private int sleepyTime;
	
	public FortuneCookie(String first, String last, int sleepyTime) {
		this.first = first;
		this.last = last;
		this.sleepyTime = sleepyTime;
	}

	public void run() {

		while (true) {
			System.out.print(first);
			try {
				Thread.sleep(sleepyTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(last);

		}

	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getSleepyTime() {
		return sleepyTime;
	}

	public void setSleepyTime(int sleepyTime) {
		this.sleepyTime = sleepyTime;
	}
	
	

}
