package com.pratiti.JDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// Loading JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading class in Memory
			// Connecting the DB
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "12345");
			System.out.println("welcome...........Got connection");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}

}
