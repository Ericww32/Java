import java.util.Scanner;

public class JS {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean[] spots = {true, true, true, true, true};
		int timeIn = 0;
		int timeOut = 0;
		double amountOwed = (double)(timeOut - timeIn) * 5;
		double total = 0;
		boolean choice = false;
		
		int i = 0;
		System.out.println("pick a spot: ");
		i = scan.nextInt();
		
		if(spots[i]){
			System.out.println("spot free");
			do{
//				timeIn++;
				System.out.println("still there? (y or n)");
				choice = scan.nextBoolean();
				timeOut++;
			}while(choice == true);
			
			total += amountOwed;
			
		}
		else{
			System.out.println("spot taken");
		}
		
		System.out.println("Amount owed: " + amountOwed + " total: " + total + " Parking spot: " +  spots[i] );
		
	}

}
