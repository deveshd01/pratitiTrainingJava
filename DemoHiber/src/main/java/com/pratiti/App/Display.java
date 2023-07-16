package com.pratiti.App;

import java.util.List;


import com.pratiti.entity.Product;

public class Display {

	public void DisplayData(List<Product>list1) {
    	
		List<Product>list = list1;
		for(Product product : list) {
    		System.out.println("Product Id       : "+product.getId());
        	System.out.println("Product Name     : "+product.getName());
        	System.out.println("Product Price    : "+product.getPrice());
        	System.out.println("Product Quantity : "+product.getQuantity());
        	System.out.println("\n---------------------------------------------------------------\n");
    	}
		
	}
		
	
}
