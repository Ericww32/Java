import java.util.*;

public class Vegas {
	
	public static void main(String[] args) {
		int total = 0;// total times played
		int Q = 100;//Quarters
		int slot1 = 0, slot2 = 0, slot3 = 0;//slot machines
		int slot1wins = 0, slot2wins = 0, slot3wins = 0;//slot machines wins
		
		while(Q >= 0){
			int i = 1;
			System.out.println("\ntotal times played:" + total + " quarters: " + Q);
		switch(i){
		case 1: i++;
				Q--;
				total++;
				if(slot1 == 33){
					Q += 25;
					slot1wins++;
					System.out.println("Yay! u win on slot 1!");
					slot1 = 0;
				}
				slot1++;
				if (Q==0){
					break;}
		case 2: i++;
				Q--;
				total++;
				if(slot2 == 99){
						Q += 75;
						slot2wins++;
						System.out.println("Yay! u win on slot 2!");
						slot2 = 0;
				}
				slot2++;
				if (Q==0){
					break;}
		case 3: i++;
				Q--;
				total++;
				if(slot3 == 9){
					Q += 7;
					slot3wins++;
					System.out.println("Yay! u win on slot 3!");
					slot3 = 0;
				}
				slot3++;
				if (Q==0){
					break;}
		}//end of switch
		
		//double money = Q / 4;
		
		}//end of while
		
		System.out.println("you won this many times on slot number 1: " + slot1wins);
		System.out.println("you won this many times on slot number 2: " + slot2wins);
		System.out.println("you won this many times on slot number 3: " + slot3wins);
}//end of main
}//end of class