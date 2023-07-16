package com.pratiti.Assesment;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class AllFunctions extends Complent {

	AllFunctions() throws IOException {
		super();
	}

	 AllFunctions(String location) throws IOException {
		super(location);
	}

//	Fetch complaint based on complaint id
	public String FetchComplaintById(int id) {
		String line = "";
		String ID = Integer.toString(id);
		int i = 0;
		int sz = this.complaints.size();
		while (i < sz) {
			line = this.complaints.get(i++);
			String[] complaint = line.split(",");

			int index = this.column.get("Complaint ID"); // fetching index value of Complaint ID column
			String Cid = complaint[index]; // fetching Complaint ID of current ROW
			if (ID.equals(Cid)) {
				return line;
			}
		}
		return null;
	}

//	Fetch all the complaints based on year
	public ArrayList<String> FetchComplaintByYear(int year)  {
		String line = "";
		ArrayList<String> ans = new ArrayList<String>();
		int i = 0;
		int sz = this.complaints.size();

		while (i < sz) {
			line = this.complaints.get(i++);
			String[] complaint = line.split(",");

			int index = column.get("Date received"); // fetching index value of date Received column
			String Date2 = complaint[index]; // fetching Date of current ROW

			int lastIndex = Date2.length() - 1;
			String YEAR = "" + Date2.charAt(lastIndex - 3) + Date2.charAt(lastIndex - 2) + Date2.charAt(lastIndex - 1)
					+ Date2.charAt(lastIndex);

			int currentYear = Integer.parseInt(YEAR); // fetching Year of current ROW

			if (currentYear == year) {
				ans.add(line);
			}
		}
		return ans;
	}

	public void ShowComplaintByYear(int y) {
		ArrayList<String> ans = FetchComplaintByYear(y);
		for (String i : ans) {
			System.out.println(i);
		}

	}

//	Fetch complaints based on the bank name
	public ArrayList<String> FetchComplaintByBank(String bank)  {

		String line = "";
		ArrayList<String> ans = new ArrayList<String>();
		int i = 0;
		int sz = this.complaints.size();

		while (i < sz) {
			line = this.complaints.get(i++);
			String[] complaint = line.split(",");

			int index = column.get("Company");
			String currentBank = complaint[index];

			if (currentBank.equals(bank)) {
				ans.add(line);
			}
		}
		return ans;
	}
	public void ShowComplaintByBank(String Bank)  {
		ArrayList<String> ans = FetchComplaintByBank(Bank);
		for (String i : ans) {
			System.out.println(i);
		}
	}
	
	
	
//	Fetch time taken by the bank to close any complaint
	public void TimeTaken(int id) {
		String line = FetchComplaintById(id);
		String[] complaint = line.split(",");
		
		int index = column.get("Date received");
		String dateReceived = complaint[index];
		
		index = column.get("Date sent to company");
		String dateSent = complaint[index];
		
		int day=Integer.parseInt(""+dateReceived.charAt(0)+dateReceived.charAt(1));
		int month=Integer.parseInt(""+dateReceived.charAt(3)+dateReceived.charAt(4));
		int year=Integer.parseInt(""+dateReceived.charAt(6)+dateReceived.charAt(7)+dateReceived.charAt(8)+dateReceived.charAt(9));
		LocalDate first_date = LocalDate.of(year, day, month);   
		
		 day=Integer.parseInt(""+dateSent.charAt(0)+dateSent.charAt(1));
		 month=Integer.parseInt(""+dateSent.charAt(3)+dateSent.charAt(4));
		 year=Integer.parseInt(""+dateSent.charAt(6)+dateSent.charAt(7)+dateSent.charAt(8)+dateSent.charAt(9));
        LocalDate second_date = LocalDate.of(year, day, month); 
		
		Period difference = Period.between(first_date, second_date);   
		
        System.out.printf( "Time taken by the bank to close this  complaint is   :   %d days, %d months and %d years",   difference.getDays(),  difference.getMonths(),   difference.getYears());   
		
		
	}

}
