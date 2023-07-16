package com.pratiti.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.Statement;

public class InsertDataPreparedStatement {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String str = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "12345");

			String sql = "insert into tbl_product(name, price, quantity) values(?, ?, ?)";
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			Scanner s = new Scanner(System.in);

			do {
				System.out.println("Enter Name");
				String name = s.nextLine();
				System.out.println("Enter product");
				double price = Double.parseDouble(s.nextLine());
				System.out.println("Enter quantity");
				int quantity = Integer.parseInt(s.nextLine());

				stmt.setString(1, name);
				stmt.setDouble(2, price);
				stmt.setInt(3, quantity);

				int count = stmt.executeUpdate();

				if (count == 1) {
					ResultSet rs = stmt.getGeneratedKeys();
					if (rs.next())
						System.out.println("Recorn Inserted.................@ - " + rs.getInt(1));
				}
				System.out.println("\n\nWant to continue.........? press Y ");
				str = s.nextLine();

			} while (str.equals("Y") || str.equals("y"));

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
