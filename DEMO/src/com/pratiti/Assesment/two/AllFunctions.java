package com.pratiti.Assesment.two;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class AllFunctions extends ReadCSV{

	AllFunctions() throws IOException {
		super();
	}
	AllFunctions(String loc) throws IOException {
		super(loc);
	}
	
	
//	Display total profit made from the sales for the whole year
	public int totalProfit() {
		int ans=0;
		String keyy = "total_profit" ;
        ArrayList<Integer> p = this.table.get(keyy);
        for( Integer i:p)ans+=i;
		
		return ans;
	}
	
//	Display the month in which there was lowest profit made from the sales
	public int lowestProfit() {
		int ans=Integer.MAX_VALUE;
		String keyy = "total_profit";
        ArrayList<Integer> p = this.table.get(keyy);
        for( Integer i:p)
        	if(ans>i)ans=i;
		
		return ans;
	}
	
//	Display which product was bought the most in a particular month
	public String mostBuy(int month) {
		 Set<String> s= table.keySet();
		 s.remove("total_profit");
		 s.remove("month_number");
		 s.remove("total_units");
		 String ans="";
		 int max=0;
		 for(String i:s) {
			 int val= table.get(i).get(month-1);
			 if(max<val) {
				 max=val;
				 ans=i;
			 }
		 }
		return ans;
	}
	
	
	
//	Display how many units of a product has been sold last year
	public int productCount(String keyy) {
		int ans=0;
        ArrayList<Integer> p = this.table.get(keyy);
        for( Integer i:p)ans+=i;
		
		return ans;
	}
	
	
}
