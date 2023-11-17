package com.java.be;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
	public static void main(String[] args) throws SQLException {
		Connection c = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://DESKTOP-J7MRH1Q:1433;encrypt=true;trustServerCertificate=true;databaseName=LTW;integratedSecurity=true;";
			String user = "sa";
			String password = "123456";
			
			c = DriverManager.getConnection(url, user, password);
			Statement stm = c.createStatement();
			
			String SQL = "select * from [USER]";
			
			System.out.println("connected!");
			
			rs = stm.executeQuery(SQL);
			
			while(rs.next()) {
				System.out.println(rs.getString("firstName") + " " + rs.getString("lastName") + " " + rs.getString("doB")
						 + " " + rs.getString("poB") + " " + rs.getString("sex"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("connection failed!");
			e.printStackTrace();
		}
	}
	
	protected static Connection initializeDatabase() throws ClassNotFoundException, SQLException {
		String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://DESKTOP-J7MRH1Q:1433;encrypt=true;trustServerCertificate=true;integratedSecurity=true;";
		String dbName = "LTW";
		String dbUsername = "sa";
		String dbPassword = "123456";
		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
		return con;
	}
}
