package com.pratiti.Assignment.two;



public class Books extends Products {
	public Books() {

	}

	public Books(String name, int id, int available, float price, String product_Description) {
		super(name, id, available, price, product_Description);

	}

//	public String Name;

	@Override
	public float calculateDiscount(int qnt) {
		return 1 / 10 * order(this, qnt);
	}

}
