import java.util.*;

public class Vegas {
	
	public static void main(String[] args) {
		int slot1 = 0,slot2 = 0,slot3 = 0;//slot machines
		int total = 0;// total times played
		int Q = 100;//Quarters
		
		while(Q != 0){
			//display(total,Q);
			//calc(slot1,slot2,slot3,total,Q);
			
			slot1++;
			Q--;
			total++;
			if(slot1 == 33){
				Q += 25;
				slot1 = 0;
			}
			else{
				;
				}
			slot2++;
			Q--;
			total++;
			if(slot2 == 99){
				Q += 75;
				slot2 = 0;
			}
			else{
				;
				}
			
			slot3++;
			Q--;
			total++;
			if(slot3 == 9){
				Q += 7;
				slot3 = 0;
			}
			else{
				break;
				}
			double money = Q / 4;
			System.out.println("\ntotal times played:" + total + " money: $" + money);
		}//end of while
		
	}//end of main
	
	/*public static double calc(int slot1, int slot2, int slot3, int total, int Q){//calculates the numbers given for the slot machines and money

		slot1++;
		Q--;
		total++;
		if(slot1 == 33){
			Q += 25;
			slot1 = 0;
		}
		
		slot2++;
		Q--;
		total++;
		if(slot2 == 99){
			Q += 75;
			slot2 = 0;
		}
		
		slot3++;
		Q--;
		total++;
		if(slot3 == 9){
			Q += 7;
			slot3 = 0;
		}
	return Q;
}//end of calc
	
	public static int checker(){// if statements
		
		
	}//end of checker
	
	public static void display(int var){//displays the total times played and how much money she has left 
	double money = Q / 4;
	System.out.println("\ntotal times played:" + total + " money: $" + money);
	
	
}//end of display
	
	//public static int var(){//variable declaration
	  
}//end of var*/

}//end of class
