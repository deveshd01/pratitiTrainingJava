package com.pratiti.Assesment.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadCSV {
	public Map<String, ArrayList<Integer>> table = new HashMap<>();

	ReadCSV() throws IOException {
		this("C:\\Users\\HP\\Desktop\\company.csv");
	}

	ReadCSV(String location) throws IOException{

		BufferedReader br = new BufferedReader(new FileReader(location));
		String line = br.readLine();
		String[] Header = line.split(",");
		
		for (String s : Header) {
			table.put(s, new ArrayList<Integer>());
		}
		
		while ((line = br.readLine()) != null) {
			String[] row = line.split(",");
			int sz=Header.length;
			for(int i=0;i<sz;i++){
				int val = Integer.parseInt(row[i]);
				table.get(Header[i]).add(val);
			}
		}
		br.close();
	}
	
	public void showTable() {
		 for (Map.Entry<String, ArrayList<Integer>> entry : this.table.entrySet()) {
	            String keyy = entry.getKey() ;
	            ArrayList<Integer> p = entry.getValue();
	            System.out.print("key = " + keyy + "  " );
	            for( Integer i:p)System.out.print(i+"  ");
	            System.out.println();
		 }
	}

}
