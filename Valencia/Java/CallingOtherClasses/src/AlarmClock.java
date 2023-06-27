
public class AlarmClock {
	int hours;// = 0;
	int min;// = 0;
	int sec;// = 0;
	private boolean io = false;
	
	AlarmClock(int hours, int min, int sec){
		// hours = x;
		//y = min;
		//z = sec;
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		
		this.hours = hours;
		
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public boolean isIo() {
		return io;
	}
	public void setIo(boolean io) {
		this.io = io;
	}
	
}
