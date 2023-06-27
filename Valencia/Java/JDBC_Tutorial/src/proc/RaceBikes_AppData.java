package proc;

import java.sql.Connection;
import java.sql.Statement;

public class RaceBikes_AppData {
	
	public RaceBikes_AppData(){
		
	}
	
	public void insertData(String bikename, String origin, int cost){
		Connection conn = null;
	
		try{
			conn = DBConnection.getConnection();
			Statement myStmt = conn.createStatement();
			String sql = "insert into RaceBikes" 
					+ "(BikeName, Country_of_origin, Cost)"
					+ "values (" + bikename + "," + origin + "," + cost + ")";
			myStmt.executeUpdate(sql);
			System.out.println("insert worked!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void updateData(String bikename, String origin, int cost){
		Connection conn = null;
		
		try{
			conn = DBConnection.getConnection();
			Statement myStmt = conn.createStatement();
			String sql = "update RaceBikes" 
					+ "set BikeName = " + bikename + ", Country_of_origin = " 
					+ origin +", Cost = " + cost
					+ "where BikeName = " + bikename;
			myStmt.executeUpdate(sql);
			System.out.println("update worked!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void deleteData(String bikename, String origin, int cost){
		Connection conn = null;
		
		try{
			conn = DBConnection.getConnection();
			Statement myStmt = conn.createStatement();
			String sql = "delete from RaceBikes" 
					+ "where BikeName = " + bikename;
			int rowsAffected = myStmt.executeUpdate(sql);
			myStmt.executeUpdate(sql);
			System.out.println("update worked!");
			System.out.println("rows affected: "+ rowsAffected);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
