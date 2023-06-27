import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vegas {
	
	public static void main(String[] args) throws IOException, MalformedURLException{
		//Sarah set the values to use
		int total = 0;// total times played
		int Q = 100;//Quarters
		int slot1 = 0, slot2 = 0, slot3 = 0;//slot machines
		//int slot1wins = slot1wins(slot1), slot2wins = slot2wins(slot2), slot3wins = slot3wins(slot3);//slot machines wins
		int slot1wins =0, slot2wins = 0, slot3wins = 0;
		
		
		while(Q >= 0){
			int i = 1;
			mainDisplay(total, Q);//Guillard was here
			//switch to isolate each slot machine and counters.
		switch(i){
		case 1: i++;
				Q--;
				total++;
				if(slot1 % 33 == 0 && slot1 != 0){
				Q = winnings1(Q);
				slot1wins = slot1wins(slot2wins);
				}
				slot1++;
				if (Q==0)
					break;
					
		case 2: i++;
				Q--;
				total++;
				if(slot2 % 99 == 0 && slot2 != 0){
				Q = winnings2(Q);
				slot2wins = slot2wins(slot2wins);
				}
				slot2++;
				if (Q==0)
					break;
					
		case 3: i++;
				Q--;
				total++;
				if(slot3 % 9 == 0 && slot3 != 0){
				Q = winnings3(Q);
				slot3wins = slot3wins(slot3wins);
				slot3 = 0;
				}
				slot3++;
				if (Q==0)
					break;
					
		}//end of switch
		
		
		}//end of while
		
		winDisplay(slot1wins, slot2wins, slot3wins);//Brandon did this
		printit(total, Q, slot1wins, slot2wins, slot3wins);
}//end of main
	
	public static void winDisplay(int slot1wins, int slot2wins, int slot3wins) throws MalformedURLException{ // method by brandon. Displays the totals of all wins per slot machine
		
		//display of final totals
		
		final ImageIcon icon = new ImageIcon(new URL("http://www.gop.gov/app/uploads/2015/06/money-throw.gif"));
			JOptionPane.showMessageDialog( null, "you won this many times on slot number 1: " + slot1wins + 
					"\nyou won this many times on slot number 2: " + slot2wins +
						"\nnyou won this many times on slot number 3: " + slot3wins, "Too Bad You Lost!", JOptionPane.INFORMATION_MESSAGE, icon);
	}//end of winDisplay
	
	
	public static void mainDisplay(int total, int Q){
		System.out.println("total times played:" + total + " quarters: " + Q);
	}
	
	public static void printit(int total, int Q, int slot1wins, int slot2wins, int slot3wins) throws IOException {//Eric did this
	
	
	String horse = "mifi.txt";

    try {
        FileWriter fileWriter = new FileWriter(horse);

        BufferedWriter out = new BufferedWriter(fileWriter);
        
        out.write("total times played:" + (total - 3) + " quarters: " + (Q + 3));
        out.newLine();
        out.write("you won this many times on slot number 1: " + slot1wins);
        out.newLine();
        out.write("you won this many times on slot number 2: " + slot2wins);
        out.newLine();
        out.write("you won this many times on slot number 3: " + slot3wins);
        out.close();
    }
    catch(IOException ex) {
    	JOptionPane.showMessageDialog( null, "Error writing to file '" + horse + "'");
    }
	}//end of printit
	
	
	// methods made by Brandon. Incrementing the amount of Quarters and printing out how much won and how much it added to the purse.
	
	public static int winnings1(int Q) throws MalformedURLException{
		
		Q = Q + 25;
			
		final ImageIcon icon = new ImageIcon(new URL("http://www.rubbercat.net/sa/jackpot.gif"));
			JOptionPane.showMessageDialog(null,"Yay! You win $6.25 on slot 1! You now have a total of $" + (double)Q/4, "Winner", JOptionPane.INFORMATION_MESSAGE, icon);
				return Q;
				
	}//end winnings1
	
	
	public static int winnings2(int Q) throws MalformedURLException{

		Q = Q + 75;
		
		final ImageIcon icon = new ImageIcon(new URL("http://www.rubbercat.net/sa/jackpot.gif"));
			JOptionPane.showMessageDialog( null,"Yay! You win $18.75 on slot 2! You now have a total of $" + (double)Q/4, "Winner" , JOptionPane.INFORMATION_MESSAGE, icon);
				return Q;
				
	}//end winnings2
	
	
	public static int winnings3(int Q) throws MalformedURLException {

		Q = Q + 7;
		
		final ImageIcon icon = new ImageIcon(new URL("http://www.rubbercat.net/sa/jackpot.gif\n\n"));
			JOptionPane.showMessageDialog( null,"Yay! You win $1.75 on slot 3! You now have a total of $" + (double)Q/4, "Winner", JOptionPane.INFORMATION_MESSAGE, icon);
				return Q;
				
	}//end winnings3
	
	
	//methods made by Brandon. This is the incremented counters for the total wins per slot machine.
	public static int slot1wins(int slot1wins){
		slot1wins++;
			return slot1wins;
	}//end slot1win
	public static int slot2wins(int slot2wins){
		slot2wins++;
			return slot2wins;
	}//end slot2win
	public static int slot3wins(int slot3wins){
		slot3wins++;		
			return slot3wins;
	}//end slot3win
	
	
}//end of class