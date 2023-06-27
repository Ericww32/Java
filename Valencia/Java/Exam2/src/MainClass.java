import java.util.*;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);

		String y;// variable for multiple String use
		int x;// variable for multiple int use
		double z;// variable for multiple double use

		int option = 0;
		int choice = 0;

		do{                
			System.out.println("Please choose from the following options: ");                
			displayMenu();                
			choice = scanf.nextInt();           
			switch(choice){                
				case 1:                      
				do{
				addMenu(); 
				option = scanf.nextInt();
				switch(option){
					case 1: Person guy = new Person(null, null, null, null, 0, 0);
					break;
					case 2: //emplyee info here
						break; 
					case 3: //manager info here
						break; 
					case 4: System.exit(-1);
						break; 
					default:                     
						break;
						}
				}while(option != 4);
			break;
				case 2:   
				do{
				singleMenu(); 
				option = scanf.nextInt();
				switch(option){
					case 1: //Display a Person
						break; 
					case 2: //Display an Employee
						break;
					case 3: //Display a Manager
						break; 
					case 4: System.exit(-1);//end
						break;                     
						}  
				}while(option != 4);
			break;
				case 3:
				do{
				allMenu(); 
				option = scanf.nextInt();
				switch(option){
					case 1://Display all People
						break; 
					case 2: //Display all Employees
						break; 
					case 3: //Display all Manager
						break; 
					case 4: System.exit(-1);//end
						break;                     
						}  
				}while(option != 4);
			break;
				case 4:                    
						System.out.println("Thanks for stopping by!");
						System.exit(-1);
						break; 
				default:                     
						System.out.println("Invalid choice, choose again");
						break;           
					} 
			} while (choice != 4); 
		scanf.close();
	}//end on main

	public static void displayMenu() {
		System.out.printf("1. Add/Edit\n");
		System.out.printf("2. Display individual\n");
		System.out.printf("3. Display all\n");
		System.out.printf("4. Exit\n\n");
	}

	public static void addMenu() {
		System.out.println("1. Add/Edit a Person");
		System.out.println("2. Add/Edit an Employee");
		System.out.println("3. Add/Edit a Manager");
	}

	public static void singleMenu() {
		System.out.println("1. Display a Person");
		System.out.println("2. Display an Employee");
		System.out.println("3. Display a Manager");
	}

	public static void allMenu() {
		System.out.println("1. Display all People");
		System.out.println("2. Dsiplay all Employees");
		System.out.println("3. Display all Managers");
	}

	/*public static void personInfo() {

		int x;// variable for multiple int use
		String y;// variable for multiple String use
		double z;// variable for multiple double use

		Scanner scanf = new Scanner(System.in);
		Person guy = new Person(null, null, 0, null);
		System.out.println("Enter a name for the person: ");
		y = scanf.nextLine();
		guy.setName(y);
		System.out.println("Hello " + guy.getName() + "\n");

		System.out.println("Give me the address: ");
		y = scanf.nextLine();
		guy.setAddress(y);
		
		System.out.println("Phone Number: ");
		x = scanf.nextInt();
		guy.setPhone(x);
		
		System.out.println("Email: ");
		y = scanf.nextLine();
		guy.setEmail(y);
		
		scanf.close();

	}*/

	

	public static void printit(Person guy) throws IOException {

		String horse = "mifi.txt";

		try {
			FileWriter fileWriter = new FileWriter(horse);

			BufferedWriter out = new BufferedWriter(fileWriter);

			out.write("Sorted list:");
			out.newLine();

			for (int i = 0; i < guy.hashCode(); i++) {
				out.write((i + 1) + ") " + guy.hashCode());
				out.newLine();
			}

			out.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + horse + "'");
		}

	}// end of printit 

}
