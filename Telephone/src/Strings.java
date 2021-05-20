
/**
 * @author Eric Willoughby
 * */

import java.util.*;

public class Strings {

	public static void main(String[] arg) throws InvalidTelephoneException {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String testString;
		Telephone phone;
		
		System.out.println("Enter a Cell Number: ");
		testString = scan.nextLine();
		
		String renewedNumber = testString.trim().replaceAll("[^0-9]", ""); //\\w\\s\\.
		
		System.out.println("This is my test: " + renewedNumber);
		
		try {
			
			phone = new Telephone(renewedNumber);
			
		} catch (Exception e) {
			throw new InvalidTelephoneException("Error ");
		}

		System.out.println("\n" + phone.toString());

	}
}