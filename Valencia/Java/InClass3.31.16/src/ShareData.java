
public class ShareData {
	private int data;

	public ShareData(int data) {
		this.data = data;
	}
	
	synchronized public void increase(int by){
		data = data + by;
		
	}
	
	synchronized public void decrease(int by){
		data = data + by;
		
	}
}
