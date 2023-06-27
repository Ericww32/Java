package Processing_Layer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

import Data_Layer.DBConnection;

/**
 * 
 * @author Eric Willoughby
 *
 */

public class Test {

	public static Connection deletePerson(int id) {

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false);

			stmt = conn.createStatement();
			String sql = "DELETE from PERSON where ID=" + id + ";";
			stmt.executeUpdate(sql);
			conn.commit();
			conn.close();

			System.out.println("Deleted Person #" + id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;

	}

	public static Connection buildTable() {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();

			String sql = "CREATE TABLE PERSON " + "(ID INTEGER PRIMARY KEY        AUTOINCREMENT, "
					+ "FIRSTNAME           CHAR(30)   NOT NULL, " + "LASTNAME            CHAR(30)   NOT NULL, "
					+ "AGE                  INT                , " + "CREDITCARD          LONG             , "
					+ "SSN                  LONG             ) ";

			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();

			System.out.println("Table created successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static ArrayList<Person> findAllPeople() {
		Connection conn = null;
		Statement stmt = null;
		ArrayList<Person> person = new ArrayList<>();

		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false);

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON;");

			while (rs.next()) {
				person.add(new Person(rs.getString("firstname"), rs.getString("lastname"), rs.getInt("age"),
						rs.getInt("creditcard"), rs.getInt("ssn")));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return person;
	}

	public static Connection insertPerson(Person person) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "INSERT INTO PERSON (FIRSTNAME,LASTNAME,AGE,CREDITCARD,SSN) " + "VALUES (" + "'"
					+ person.getFirstName() + "'," + "'" + person.getLastName() + "'," + person.getAge() + ","
					+ person.getCreditCard() + "," + person.getSsn() + " );";

			stmt.executeUpdate(sql);

			stmt.close();
			conn.commit();
			conn.close();

			System.out.println("Person inserted into database: " + person.getLastName() + ", " + person.getFirstName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void popTable() {

		Person guy0 = new Person("Bruce", "Wayne", 30, randomNumber(), randomNumber());
		Person guy1 = new Person("Clark", "Kent", 29, randomNumber(), randomNumber());
		Person guy2 = new Person("Barry", "Allen", 28, randomNumber(), randomNumber());
		Person guy3 = new Person("Diana", "Prince", 1006, randomNumber(), randomNumber());
		Person guy4 = new Person("Hal", "Jordan", 31, randomNumber(), randomNumber());
		Person guy5 = new Person("Victor", "Stone", 18, randomNumber(), randomNumber());
		Person guy6 = new Person("Arthur", "Curry", 50, randomNumber(), randomNumber());

		insertPerson(guy0);
		insertPerson(guy1);
		insertPerson(guy2);
		insertPerson(guy3);
		insertPerson(guy4);
		insertPerson(guy5);
		insertPerson(guy6);

	}

	public static long randomNumber() {
		Random rand = new Random();
		long number = 0;
		number = rand.nextInt(999999) + 100000;

		return number;
	}

	public static Person selectPerson(int id) {
		Connection conn = null;
		Statement stmt = null;
		Person dude = new Person(null, null, id, id, id);
		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false);

			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON where ID=" + id + ";");

			while (rs.next()) {
				dude.setFirstName(rs.getString("firstname"));
				dude.setLastName(rs.getString("lastname"));
				dude.setAge(rs.getInt("age"));
				dude.setCreditCard(rs.getInt("creditcard"));
				dude.setSsn(rs.getInt("ssn"));
			}

			rs.close();
			stmt.close();
			conn.close();

			System.out.println("Selected Person #" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dude;
	}

}
