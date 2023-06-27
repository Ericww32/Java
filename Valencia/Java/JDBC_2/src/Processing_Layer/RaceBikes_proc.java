package Processing_Layer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import Data_Layer.DBConnection;

/**
 * 
 * @author Eric Willoughby
 *
 */

public class RaceBikes_proc {
	
	public static Connection addBike(RaceBikes biker) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "INSERT INTO RACEBIKES (bikename, country_of_origin, cost) " + "VALUES (" + "'"
					+ biker.getBikename() + "'," + "," + biker.getCountry_of_origin() + "," + biker.getCost() + " );";

			stmt.executeUpdate(sql);

			stmt.close();
			conn.commit();
			conn.close();

			JOptionPane.showMessageDialog(null, "RaceBike inserted into database: " + biker.getBikename());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something terrible has happened! Check the console");
			e.printStackTrace();
		}
		return conn;
	}

	public static Connection deleteBike(int id) {

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

			JOptionPane.showMessageDialog(null, "Deleted RaceBike #" + id);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something terrible has happened! Check the console");
			e.printStackTrace();
		}

		return conn;

	}
	
	public static Connection updateBike(RaceBikes biker) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBConnection.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "INSERT INTO RACEBIKES (bikename, country_of_origin, cost) " + "VALUES (" + "'"
					+ biker.getBikename() + "'," + "," + biker.getCountry_of_origin() + "," + biker.getCost() + " );";

			stmt.executeUpdate(sql);

			stmt.close();
			conn.commit();
			conn.close();

			JOptionPane.showMessageDialog(null, "RaceBike updated in the database: " + biker.getBikename());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something terrible has happened! Check the console");
			e.printStackTrace();
		}
		return conn;
	}

	public static ArrayList<Object> findAllPeople() {
		Connection conn = null;
		Statement stmt = null;
		ArrayList<Object> person = new ArrayList<>();

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
