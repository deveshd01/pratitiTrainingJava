package com.pratiti.JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

//import com.mysql.cj.xdevapi.Statement;

public class InsertDataFromUser {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "12345");
			stmt = conn.createStatement();
			String str=null;
			Scanner s=new Scanner(System.in);
			
			do
			{
				System.out.println("Enter Name");
				String name=s.nextLine();
				System.out.println("Enter product");
				double price = Double.parseDouble(s.nextLine());
				System.out.println("Enter quantity");
				int quantity = Integer.parseInt(s.nextLine());
				
				String sql= "insert into tbl_product(name, price, quantity) values( '"+name+"' , "+price+" , "+quantity+ ")";
				int count=stmt.executeUpdate(sql);
				if(count==1)
					System.out.println("Recorn Inserted.................");
						
				System.out.println("\n\nWant to continue.........? press Y ");
				str=s.nextLine();
				
			}while(str.equals("Y") ||str.equals("y") );
	
		
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
