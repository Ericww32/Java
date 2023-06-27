import java.util.*;
public class health {

	  public static void main(String[] args) {
	    Scanner scanf = new Scanner(System.in);
	    double pounds;
	    double kg;//kilograms
	    double inches;
	    double m;//meters
	    double result;
	     
	    System.out.print("Enter your weight in pounds:\n");
	    pounds = scanf.nextDouble();
	    kg = pounds/2.2;
	    
	    System.out.print("Enter your height in inches:\n");
	    inches = scanf.nextDouble();
	    m = inches/39.370;
	    
	    // BMI formula ( weight / height * height )
	    result = ( kg / (m * m));
	    
	    System.out.print("Your BMI is " + result );
	    
	    scanf.close();
	  }
}