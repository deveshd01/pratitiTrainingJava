package com.pratiti.App;

import java.util.List;

import java.util.Scanner;
import com.pratiti.dao.ProductDao;
import com.pratiti.entity.Product;

public class ProductApp {
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	ProductDao dao = new ProductDao();
    	Display D = new Display();

    	
    // Adding Product in Database
    	System.out.println("Do you want to add (yes = 1 / no = 0) : ");
    	int n = sc.nextInt();
    
     if(n==1) {
    	Product product = new Product();
    	System.out.println("Enter Product name : ");
    	String product_name = sc.next();
		product.setName(product_name);
    	
    	System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();;
		product.setPrice(price);
    	
    	System.out.println("Enter Product Quantity : ");
		int quantity = sc.nextInt();;
		product.setQuantity(quantity);
       	
    	dao.add(product);
       }
    	
     
     // Fetch Product on specific index
    	Product product1 = dao.fetch(7);
    	if(product1 != null) {
    	System.out.println("Product Id       : "+product1.getId());
    	System.out.println("Product Name     : "+product1.getName());
    	System.out.println("Product Price    : "+product1.getPrice());
    	System.out.println("Product Quantity : "+product1.getQuantity());
    	System.out.println("\n---------------------------------------------------------------\n");
    	}
    	
    	
    	// Fetch All Product
    	List<Product>list = dao.fetchAll();
    	D.DisplayData(list);
    	
    	
    	
    	// Fetch All Product by value
    	
    	System.out.println("Do you want to Find value of any product by value (yes = 1 / no = 0) : ");
    	int n1 = sc.nextInt();
    	
    	if(n1 == 1) {
    	System.out.println("Enter your minimum base value : ");
    	int priceSC = sc.nextInt();
    	List<Product>list1 = dao.fetchByPrice(priceSC);
        D.DisplayData(list1);
    	}
    	
    	
    	// Fetch All Product by name
    	System.out.println("Do you want to Find detail of any product by name (yes = 1 / no = 0) : ");
    	int n2 = sc.nextInt();
    	
    	if(n2==1) {
    	System.out.println("Enter Product name and find its price : ");
    	String nameSC = sc.next();
    	List<Product>list2 = dao.fetchByName(nameSC);
        D.DisplayData(list2);
    	}
    	
    	
    	// Update The Data
    	System.out.println("Do you want to update of any product (yes = 1 / no = 0) : ");
    	int n3 = sc.nextInt();
    	
    	if(n3==1) {
        Product product2 = dao.fetch(1);
        product2.setPrice(product2.getPrice()- product2.getId()*0.10);
        dao.update(product2);
    	}
    	
    	
        
        //Delete the Data
    	System.out.println("Do you want to Delete any product (yes = 1 / no = 0) : ");
    	int n4 = sc.nextInt();
    	
    	if(n4==1) {
        System.out.println("Enter ID of product which You want to delete :");
        int delID = sc.nextInt();
    	Product product3 = dao.delete(delID);
    	}
    	
	}
}
