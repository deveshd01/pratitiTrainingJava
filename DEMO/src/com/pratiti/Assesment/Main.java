package com.pratiti.Assesment;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {

			String location = "C:\\Users\\HP\\Desktop\\complaints.csv";
			AllFunctions obj = new AllFunctions(location);

			System.out.println("What do you want to do  : ");
			System.out.println("1. Fetch complaint based on complaint id");
			System.out.println("2. Fetch all the complaints based on year");
			System.out.println("3. Fetch complaints based on the bank name");
			System.out.println("4. Fetch time taken by the bank to close any complaint");
			Scanner s = new Scanner(System.in);

			int op = Integer.parseInt(s.nextLine());
			switch (op) {
			case 1:
				int id = Integer.parseInt(s.nextLine());
				System.out.println("******************* Complaint Details ***********************");
				System.out.println(obj.FetchComplaintById(id));
				break;
			case 2:
				int year = Integer.parseInt(s.nextLine());
				obj.ShowComplaintByYear(year);
				break;
			case 3:
				String bank = s.nextLine();
				obj.ShowComplaintByBank(bank);
				break;
			case 4:
				id = Integer.parseInt(s.nextLine());
				obj.TimeTaken(id);
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
