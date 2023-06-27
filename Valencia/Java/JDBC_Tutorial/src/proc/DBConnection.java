package proc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Eric Willoughby
 *
 */

public class DBConnection {

	private static Connection conn;

	public static Connection getConnection() throws SQLException {

		if (conn == null || conn.isClosed()) {
			conn = create_new_connection(conn);
		}
		return conn;
	}

	private static Connection create_new_connection(Connection conn) {

		try {

			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:JusticeLeague.db");
			System.out.println("Justice Leage database opened successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}