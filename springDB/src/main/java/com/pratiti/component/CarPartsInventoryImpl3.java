package com.pratiti.component;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component("carPA3")
public class CarPartsInventoryImpl3 implements CarPartsInventory{

	@Autowired
	private DataSource dataSource;
		
	public void addNewPart(CarPart carPart) {
		// No need of connection Object in this 	// No PraparedStatement object
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "insert into tbl_carpart(part_no, part_name, car_model, price, quantity) values(?, ?, ?, ?, ?)";
		jt.update(sql, carPart.getPartNo(), carPart.getPartName(), carPart.getCarModel(), carPart.getPrice(), carPart.getQuantity());
	}

	public List<CarPart> getAvailableParts() {
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "select * from tbl_carpart";
		List<CarPart> ans = jt.query(sql, BeanPropertyRowMapper.newInstance(CarPart.class));
		return ans;
	}
}
