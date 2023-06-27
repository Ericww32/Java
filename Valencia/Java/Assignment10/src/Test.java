import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		ResultSet result = null;
		Person guy = new Person(null, null, 0, 0, 0);
		int choice = 0;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "CREATE TABLE COMPANY " 
					+ "(SSN        LONG PRIMARY KEY     NOT NULL,"
					+ " FIRST_NAME           TEXT    NOT NULL, " 
					+ " LAST_NAME           TEXT    NOT NULL, "
					+ " AGE            INT     NOT NULL, " 
					+ " CREDIT_CARD         LONG)";
			stmt.executeUpdate(sql);
			result = stmt.executeQuery(sql);
			
			display();
			while(choice != 5){
			Scanner scanf = new Scanner(System.in);
			choice = scanf.nextInt();
			
				switch(choice){
				case 1: insertPerson(guy);
				break;
				case 2: selectPerson(guy);
				break;
				case 3: findAllPeople(guy, result);
				break;
				case 4: deletePerson(guy);
				break;
				case 5: break;
				default: System.out.println("Error");
			
				}
			}
			
			stmt.close();
			c.close();
		}catch(Exception e)
	{
		System.err.println(e.getClass().getName() + ": " + e.getMessage());
		System.exit(0);
	}System.out.println("Table created successfully");
	}
	
	public static void display(){
		System.out.println("PICK 1 - 5:");
		System.out.println("1) Insert Person");
		System.out.println("2) Select Person");
		System.out.println("3) Find all People");
		System.out.println("4) Delete Person");
		System.out.println("5) Quit");
	}

	public static void insertPerson(Person person) {
		String firstName;
		String lastName;
		int age;
		long ssn;
		long creditCard;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("First name: ");
		firstName = scan.nextLine();
		person.setFirstName(firstName);

		System.out.print("Last name: ");
		lastName = scan.nextLine();
		person.setLastName(lastName);

		System.out.print("Age: ");
		age = scan.nextInt();
		person.setAge(age);

		System.out.print("SSN: ");
		ssn = scan.nextLong();
		person.setSsn(ssn);

		System.out.print("Credit card: ");
		creditCard = scan.nextLong();
		person.setCreditCard(creditCard);

	}

	public static void selectPerson(Person person) {

	}

	public static ArrayList<Person> findAllPeople(Person person, ResultSet result) {
		ArrayList<Person> allPeople = new ArrayList<Person>();
		try {
			while (result.next()) {
				result.getString("FIRST_NAME") + ", " + result.getString("LAST_NAME") + ", "
						+ result.getString("AGE") + ", " + result.getString("SSN") + ", "
						+ result.getString("CREDIT_CARD"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allPeople;

	}

	public static void deletePerson(Person person) {
		if (person == null) {

		}
	}

}
