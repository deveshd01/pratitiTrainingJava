package com.pratiti.Assignment.two;



public class Products {
	public String Name;
	public int id;
	public int available;
	public float Price;
	public String product_Description;

	public Products() {

	}

	public Products(String name, int id, int available, float price, String product_Description) {
		super();
		Name = name;
		this.id = id;
		this.available = available;
		Price = price;
		this.product_Description = product_Description;
	}

	public void display() {
		System.out.println("Products [Name=" + Name + ", id=" + id + ", available=" + available + ", Price=" + Price
				+ ", product_Description=" + product_Description + "]");
	}

	public void changeDescription(String s) {
		this.product_Description = s;
	}

	public float order(Products obj, int qnt) {
		if (qnt > obj.available) {
			System.out.println("item not available");
			return 0;
		}
		return this.Price * qnt;
	}

	public float calculateDiscount(int qnt) {
		return 0;
	}


}
