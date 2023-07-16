package com.pratiti.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity
@NamedQuery(name="Payment.findAll", query="SELECT p FROM Payment p")
public class Payment  {
	private static final long serialVersionUID = 1L;

	private byte allowed;

	private int id;

	private String type;

	public Payment() {
	}

	public byte getAllowed() {
		return this.allowed;
	}

	public void setAllowed(byte allowed) {
		this.allowed = allowed;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}