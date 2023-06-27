package week10;

public class NotImplementedException extends Exception{

	private static final long serialVersionUID = 6720144767871427808L;

	public NotImplementedException(){
		
		super.getMessage();
		
	}
	
	public NotImplementedException(String msg){
		
		super(msg);
		
	}
	
	public NotImplementedException(String msg, Throwable cause){
		
		super(msg, cause);
		
	}
	
}
