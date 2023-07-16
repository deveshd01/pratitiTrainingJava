package com.pratiti.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the shippers database table.
 * 
 */
@Entity
@Table(name="shippers")
@NamedQuery(name="Shipper.findAll", query="SELECT s FROM Shipper s")
public class Shipper  {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String name;

	private int phone;

	public Shipper() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}