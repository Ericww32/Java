import java.lang.*;

public class OutOfMilkException extends Exception {

	public OutOfMilkException(int timer){
		super("you are out of milk WA WA WAAA! \n" 
				+ "It took you " + timer + " trys and " 
				+ System.currentTimeMillis() 
				+ " miliseconds to drink it all!");
	}
}
