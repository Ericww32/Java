
public class Dice {

	public static void main(String[] args) {

		System.out.println("Looking for: Die1: Die2: die3: Result:");

		for (int i = 1; i <= 100; i++) {
			double counter = 0;
			double dice1 = Math.floor((Math.random() * 7) + 1);
			double dice2 = Math.floor((Math.random() * 7) + 1);
			double dice3 = Math.floor((Math.random() * 7) + 1);
			double result = dice1 + dice2 + dice3;

			System.out.println("  " + i + "   \t" + (int)dice1 + "   \t" + (int)dice2 + "   \t" + (int)dice3 + "\t" + result);
			if (result == 7) {
				System.out.println("winner");
				break;
			}

			switch ((int) result) {
			case 1:
				counter += 1;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			case 2:
				counter += 2;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			case 3:
				counter += 3;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			case 4:
				counter += 4;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			case 5:
				counter += 5;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			case 6:
				counter += 6;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			case 7:
				counter += 7;
				if(counter == 7){
					System.out.println("winner");
				}
				break;
			}

		}

	}

}
