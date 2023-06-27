import java.util.*;

public class Peeps {

	public static void main() {
		Person guy1 = new Person("Eric", "W.","Willoughby", 'M', 25, 10000);
		Person guy2 = new Person("Ashley", "S.", "Smith", 'F', 23, 12000);
		Person guy3 = new Person("Bobby", "H.", "Wesson", 'M', 30, 80000);
		
		String choice = "Y";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		do{
			display(guy1, guy2, guy3);
			System.out.println("Does this look right? \n "
			+ "should we change it?\n (Y or N)");
			choice = scan.next();
			choice.toUpperCase();
			
			if (choice == "Y"){
				System.out.println("what person?\n (guy1, guy2, guy3)");
				String guy = " ";//reusable string
				char x = ' ';//reusable char
				int y = 1;//reusable int
				float s = 0;//reusable float
				
				guy = scan.next();
				
				if (guy == "guy1"){
					System.out.println("Enter the first name: ");
					guy1.setFirst_name(guy);

					System.out.println("Is there a middle name?\n (Y or N)");
					guy = scan.next();
					guy.toUpperCase();
					if (guy == "Y") {
						System.out.println("Enter the middle name: ");
						guy1.setMiddle_name(guy);
					}
					else if(guy == "N"){
						guy1.setMiddle_name("");
					}
					
					System.out.println("Enter the last name: ");
					guy1.setLast_name(guy);
					
					System.out.println("Enter the gender: ");
					guy1.setGender(x);
					if(!(x == 'M') || !(x == 'F') 
							|| !(x == 'm') || !(x == 'f')){
						System.out.println("ERROR \n Do Not Understand Gender Input");
						do{
							System.out.println("Enter the gender: ");
							guy1.setGender(x);
						}while(!(x == 'M') || !(x == 'F') 
								|| !(x == 'm') || !(x == 'f'));
					}
					
					System.out.println("Enter the age:");
					guy1.setAge(y);
					if(y > 120 || y < 1){
						System.out.println("Error \n Age is invalid");
						do{
							System.out.println("Enter the age: ");
							guy1.setAge(y);
						}while(y > 120 || y < 1);
					}
					System.out.println("Enter salary: ");
					guy1.setSalary(s);
					if (s <= 0){
						System.out.println("Error \n Must Be Positive");
						do{
							System.out.println("Enter the salary: ");
							guy1.setSalary(s);
						}while(s <= 0);
					}
				}
				if (guy == "guy2"){
					System.out.println("Enter the first name: ");
					guy2.setFirst_name(guy);

					System.out.println("Is there a middle name?\n (Y or N)");
					guy = scan.next();
					guy.toUpperCase();
					if (guy == "Y") {
						System.out.println("Enter the middle name: ");
						guy2.setMiddle_name(guy);
					}
					else if(guy == "N"){
						guy2.setMiddle_name("");
					}
					
					System.out.println("Enter the last name: ");
					guy2.setLast_name(guy);
					
					System.out.println("Enter the gender: ");
					guy2.setGender(x);
					if(!(x == 'M') || !(x == 'F') 
							|| !(x == 'm') || !(x == 'f')){
						System.out.println("ERROR \n Do Not Understand Gender Input");
						do{
							System.out.println("Enter the gender: ");
							guy2.setGender(x);
						}while(!(x == 'M') || !(x == 'F') 
								|| !(x == 'm') || !(x == 'f'));
					}
					
					System.out.println("Enter the age:");
					guy2.setAge(y);
					if(y > 120 || y < 1){
						System.out.println("Error \n Age is invalid");
						do{
							System.out.println("Enter the age: ");
							guy2.setAge(y);
						}while(y > 120 || y < 1);
					}
					System.out.println("Enter salary: ");
					guy2.setSalary(s);
					if (s <= 0){
						System.out.println("Error \n Must Be Positive");
						do{
							System.out.println("Enter the salary: ");
							guy2.setSalary(s);
						}while(s <= 0);
					}
				}
				if (guy == "guy3"){
					System.out.println("Enter the first name: ");
					guy3.setFirst_name(guy);

					System.out.println("Is there a middle name?\n (Y or N)");
					guy = scan.next();
					guy.toUpperCase();
					if (guy == "Y") {
						System.out.println("Enter the middle name: ");
						guy3.setMiddle_name(guy);
					}
					else if(guy == "N"){
						guy3.setMiddle_name("");
					}
					
					System.out.println("Enter the last name: ");
					guy3.setLast_name(guy);
					
					System.out.println("Enter the gender: ");
					guy3.setGender(x);
					if(!(x == 'M') || !(x == 'F') 
							|| !(x == 'm') || !(x == 'f')){
						System.out.println("ERROR \n Do Not Understand Gender Input");
						do{
							System.out.println("Enter the gender: ");
							guy3.setGender(x);
						}while(!(x == 'M') || !(x == 'F') 
								|| !(x == 'm') || !(x == 'f'));
					}
					
					System.out.println("Enter the age:");
					guy3.setAge(y);
					if(y > 120 || y < 1){
						System.out.println("Error \n Age is invalid");
						do{
							System.out.println("Enter the age: ");
							guy3.setAge(y);
						}while(y > 120 || y < 1);
					}
					System.out.println("Enter salary: ");
					guy3.setSalary(s);
					if (s <= 0){
						System.out.println("Error \n Must Be Positive");
						do{
							System.out.println("Enter the salary: ");
							guy3.setSalary(s);
						}while(s <= 0);
					}
				}
			}
		}while(choice == "Y");
		
		
	}
	
	public static void display(Person guy1, Person guy2, Person guy3){
		guy1.toString();
		guy2.toString();
		guy3.toString();
		
	}

}
