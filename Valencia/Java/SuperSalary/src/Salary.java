import java.util.*;

public class Salary {

		private static Scanner scanf;

		public static void main(String[] args) {
			
			int choice = 0;
			String select = "";
	do{
			displayMenu();
			do{
				switch(choice){
				case 1: calc();
					break;
				//case 2: displayTotals();
				//	break;
				}
			}while(choice != 3);
		}//end main
		}while(select != "N");
}

		public static void displayMenu(){
			System.out.println("*** PAY ROLL MENU ***\n"
					+"1) Calculate Pay Roll for an individual employee for this pay period\n"
					+ "2) Display Company Totals for this pay period\n3) Quit");
	}//end display
		
		public static void displayTotals(String calc){
			
			for(int i = 0; i< 9999; i++){
			System.out.println("\nTotal for this pay history: $" + calc().name[i]);
			}
			
		}//end display totals 
		
		
		public static String calc(){//case 1
			scanf = new Scanner(System.in);
			int i = 0;
			String[] name = {""};
			double hourRate = 0, hoursWorked = 0, regPay = 0, otPayRate = 0, grossPay = 0;
			double fedTax = .07, SSN = .05, otherTax = .01;
			
			System.out.println("what is your name?\n");
			name[i] = scanf.next();
			System.out.println("whats your hourly rate?\n");
			hourRate = scanf.nextDouble();
			System.out.println("whats your hours worked?\n");
			hoursWorked = scanf.nextDouble();
			
			if(hoursWorked > 40){
				otPayRate = (hoursWorked - 40) * ((regPay/2) +regPay);
			}
			
			regPay = hourRate * hoursWorked;
			
			grossPay = otPayRate + regPay;
			
			double netPay = grossPay - (grossPay * (fedTax + SSN + otherTax));

			
			return name[i]; //everything should link to name
		}// end of calc
}//end class
