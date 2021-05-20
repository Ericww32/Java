import java.util.*;

public class Salary {

		public static void main(String[] args) {
			Scanner scanf = new Scanner(System.in);
			int choice = 0;
	
			displayMenu();
			
			do{
				choice = scanf.nextInt();
				switch(choice){
				case 1: calc();
					break;
				//case 2:displayTotals(calc());
					//break;
				}
			}while(choice != 3 && choice <= 3);
		}//end main
		
		public static void displayMenu(){
			System.out.println("*** PAY ROLL MENU ***\n"
					+"1) Calculate Pay Roll for an individual employee for this pay period\n"
					+ "2) Display Company Totals for this pay period\n3) Quit");
	}//end displayMenu
		
	/*	public static void displayTotals(int calc){//case 2
			System.out.println("Total for this pay history: \n");
			for(int i = 0; i<9999;i++){
				System.out.println("Name " + name[i]);
				System.out.println("hourly rate " + hourRate[i]);
				System.out.println("hours worked " + hoursWorked[i]);
				System.out.println("regular pay " + regPay[i]);
				System.out.println("over time rate " + otPayRate[i]);
				System.out.println("gross pay " + gross[i]);
				System.out.println("fed Tax " + fedTax);
				System.out.println("SSN " + SSN);
				System.out.println("Other tax " + otherTax);
				System.out.println("total tax " + tax[i]);
				System.out.println("Net pay " + netPay[i]);
			}
			
		}//end display totals */
		
		
		public static int calc(){//case 1
			Scanner scanf = new Scanner(System.in);
			int i = 0;
			String[] name = {""};
			double[] hourRate = {};
			double[] hoursWorked = {};
			double[] regPay = {};
			double[] otPayRate = {};
			double[] grossPay = {};
			double fedTax = .28;
			double SSN = .075;
			double otherTax = .01;
			double[] tax = {fedTax,SSN,otherTax};
			double[] netPay = {};
			
			System.out.println("what is your name?\n");
			name[i] = scanf.next();
			System.out.println("whats your hourly rate?\n");
			hourRate[i] = scanf.nextDouble();
			System.out.println("whats your hours worked?\n");
			hoursWorked[i] = scanf.nextDouble();
			
			if(hoursWorked[i] > 40){
				otPayRate[i] = (hoursWorked[i] - 40) * ((hourRate[i]/2) + hourRate[i]);
			}
			
			regPay[i] = hourRate[i] * hoursWorked[i];
			
			grossPay[i] = otPayRate[i] + regPay[i];
			
			netPay[i] = grossPay[i] - (grossPay[i] * (fedTax + SSN + otherTax));

			i++;
			
			System.out.println("Name " + name[i]);
			System.out.println("hourly rate " + hourRate[i]);
			System.out.println("hours worked " + hoursWorked[i]);
			System.out.println("regular pay " + regPay[i]);
			System.out.println("over time rate " + otPayRate[i]);
			System.out.println("gross pay " + grossPay[i]);
			System.out.println("fed Tax " + fedTax);
			System.out.println("SSN " + SSN);
			System.out.println("Other tax " + otherTax);
			System.out.println("total tax " + tax[i]);
			System.out.println("Net pay " + netPay[i]);
			
			return 0; 
		}// end of calc
		
}//end class
