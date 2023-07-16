package com.pratiti.Assignment.two;



public class Toys extends Products {
	public Toys()  {
		
	}
	

	public Toys(String name, int id, int available, float price, String product_Description) {
		super(name, id, available, price, product_Description);
	}


	int ageLimit;
	
	@Override
	public float calculateDiscount(int qnt){
		if(this.ageLimit<=4)
			return 15/100 * order(this,qnt);
		if(this.ageLimit<=5)
			return 5/100 * order(this, qnt);
		return 0;	
	}

}
