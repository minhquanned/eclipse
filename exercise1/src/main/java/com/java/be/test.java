package com.java.be;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection c = dbConnect.initializeDatabase();
		Statement stm = c.createStatement();
		ResultSet rs = stm.executeQuery("select top 1 idUser from [USER] order by idUser desc");
		while(rs.next()) {
			System.out.println(rs.getInt("idUser"));
		}
	}
}
