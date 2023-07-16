package com.pratiti.Assesment;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Complent {

	public Map<String, Integer> column;		// column name  index value
	public ArrayList<String> complaints  = new ArrayList<String>(); ;
	public String location;					// path of CSV file

	// default constructor
	Complent() throws IOException {
//		this("C:\\Users\\HP\\Desktop\\complaints.csv");
	}

	// Parameterized constructor
	Complent(String location) throws IOException {
		this.location=location;
		BufferedReader br = new BufferedReader(new FileReader(location));
		String line = br.readLine();
		String[] complaint = line.split(",");
		
		Map<String, Integer> ans = new HashMap<>();
		int i = 0;
		for (String s : complaint) {
			ans.put(s, i++);
		}
		column = ans;

		while ((line = br.readLine()) != null) {
			complaints.add(line);
		}
		br.close();
	}

	public void showComplents() {
			for(String s:complaints) {
				System.out.println(s);
			}
		
	}
}
