package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interview {
	
	
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
////		int abc=Integer.parseInt(sc.nextLine());
//		String str=sc.nextLine();


		String str1= "dhote";
		String str2= "deveshabc";
		String str3="dhohtedho";
		
		Map<Integer, Character> mp = new HashMap<>();
		
		String ans="";
		int j=0;
		for(int i=0;i<str2.length();i++) {
			if(mp.containsKey(str2.charAt(i))) {
				ans+=mp.get(str2.charAt(i));
			}
			else {
				mp.put((int)str2.charAt(i), str1.charAt(j));
				ans+=str1.charAt(j);
				j++;
				j=j%str1.length();
			}
		}
		System.out.println(ans);
	
	}

}
