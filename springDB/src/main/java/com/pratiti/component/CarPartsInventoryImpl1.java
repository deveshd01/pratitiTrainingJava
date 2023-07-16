package com.pratiti.component;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("carPA1")
public class CarPartsInventoryImpl1 implements CarPartsInventory{

	
	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			// Loading class in Memory
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","12345");
			
			String sql = "insert into tbl_carpart(part_no, part_name, car_model, price, quantity) values(?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, carPart.getPartNo());
			stmt.setString(2, carPart.getPartName());
			stmt.setString(3, carPart.getCarModel());
			stmt.setDouble(4, carPart.getPrice());
			stmt.setInt(5, carPart.getQuantity());
			
			stmt.executeUpdate();
			
		} catch(ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {conn.close();} catch(Exception e){}
		}
		
	}

	public List<CarPart> getAvailableParts() {
		Connection conn = null;
		Statement stmt = null;
		List<CarPart> ans = new ArrayList<CarPart>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// Loading class in Memory
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","12345");
			
			
			stmt = conn.createStatement();

			String sql = "select * from tbl_carpart";
			ResultSet rs = stmt.executeQuery(sql);

			
			while (rs.next()) {
				CarPart obj = new CarPart();
				obj.setPartNo(rs.getInt("part_no"));
				obj.setPartName(rs.getString("part_name"));
				obj.setCarModel(rs.getString("car_model"));
				obj.setPrice(rs.getDouble(4));				// we also can use column INDEX
				obj.setQuantity(rs.getInt(5));
				ans.add(obj);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {  conn.close();  } catch (Exception e) { }
		}
		return ans;
	}

}
