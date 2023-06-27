import java.util.*;

public class SnowballFight {

	public static void main(String[] args) {
		boolean cold;
		boolean winter;
		boolean snowing;
		boolean friends_over;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Y or N only please\n");

		System.out.println("Is it cold out?");
		String cold2 = scan.nextLine();
		if (cold2 == "Y" || cold2 == "y") {
			cold = true;
		} else {
			cold = false;
		}

		System.out.println("Is it winter?");
		String winter2 = scan.nextLine();
		if (winter2 == "Y" || winter2 == "y") {
			winter = true;
		} else {
			winter = false;
		}

		System.out.println("Is it snowing?");
		String snowing2 = scan.nextLine();
		if (snowing2 == "Y" || snowing2 == "y") {
			snowing = true;
		} else {
			snowing = false;
		}

		System.out.println("Are your friends over?");
		String friends2 = scan.nextLine();
		if (friends2 == "Y" || friends2 == "y") {
			friends_over = true;
		} else {
			friends_over = false;
		}

		if (cold == true && winter == true && snowing == true && friends_over == true) {
			System.out.println("It's a trap! Have a snowball fight!!!");
		} else {
			System.out.println("go inside! its just not worth it!");
		}

		System.out.println("\nmade it outside of the if statement!");

	}

}
