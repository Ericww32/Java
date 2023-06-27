import java.util.*;
import javax.swing.*;
public class salory {
	static Scanner scanf = new Scanner(System.in);
	public static final String[] message = {"Calculate Pay Roll for an individual employee for this pay period",
				"Display Company Totals for this pay period", "Quit"};
	
	public static void main(String[] args) {
		String name;
		float hourRate, hoursWorked, regPay, otPayRate, grossPay, fedTax, SSN, otherTax, netPay;
		int choice = 0;
		displayMenu(choice);
		do{
			switch(choice){
			case 1: 
				break;
			case 2:
				break;
			case 3: System.exit(0);
				break;
			}
		}while(choice != 3);
	}//end main
	
	public static int displayMenu(int choice){
		JFrame frame = new JFrame();
		Object picker = JOptionPane.showInputDialog(frame,"What would you like to do?", "*** PAY ROLL MENU ***",
		        JOptionPane.INFORMATION_MESSAGE, null, message, message[0]); 
		if (picker == message[0]){
			choice = 1;
		}
		else if (picker == message[1]){
			choice = 2;
		}
		else if (picker == message[2]){
			choice = 3;
		}
		
		return choice;
		
	}//end displayMenu

}//end class
