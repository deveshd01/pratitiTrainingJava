package com.pratiti.Assesment.two;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {

		try {

			String location = "C:\\Users\\HP\\Desktop\\company.csv";
			AllFunctions obj = new AllFunctions(location);

			System.out.println("What do you want to do  : ");
			System.out.println("1. Display total profit made from the sales for the whole year");
			System.out.println("2. Display the month in which there was lowest profit made from the sales");
			System.out.println("3. Display which product was bought the most in a particular month");
			System.out.println("4. Display how many units of a product has been sold last year");
			Scanner s = new Scanner(System.in);

			int op = Integer.parseInt(s.nextLine());
			switch (op) {
			case 1:
				System.out.println("Total Profit is :   " + obj.totalProfit());
				break;
			case 2:
				System.out.println("Lowest Profit is :   " + obj.lowestProfit());
				break;
			case 3:
				System.out.println("Enter month Number");
				int month = Integer.parseInt(s.nextLine());
				obj.mostBuy(month);
				break;
			case 4:
				System.out.println("Enter Product Name");
				String Product_name = s.nextLine();
				System.out.println("Total units sold  is :   " + obj.productCount(Product_name));
				break;
			default:
				System.out.println("Wrong Option **********");
			}
			s.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
