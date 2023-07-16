package com.pratiti.JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectFromDB {

	static void createS() {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "12345");
			stmt = conn.createStatement();

			String sql = "select * from tbl_product";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("ID     Name    Price     quantity");
			while (rs.next()) {
				System.out.print("" + rs.getInt("id")); // we use column Name
				System.out.print("      " + rs.getString("name"));
				System.out.print("       " + rs.getDouble(3)); // we also can use column INDEX
				System.out.println("        " + rs.getInt(4));
			}

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

	static void prepareS() {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "12345");
String sql = "select * from tbl_product WHERE price<?";
stmt = conn.prepareStatement(sql);
stmt.setDouble(1, 30);
ResultSet rs = stmt.executeQuery();

			System.out.println("ID     Name    Price     quantity");
			while (rs.next()) {
				System.out.print("" + rs.getInt("id"));
				System.out.print("      " + rs.getString("name"));
				System.out.print("       " + rs.getDouble("price"));
				System.out.println("        " + rs.getInt("quantity"));
			}

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

	public static void main(String[] args) {
//		prepareS();
		createS();
	}

}
