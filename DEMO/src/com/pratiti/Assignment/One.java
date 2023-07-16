package com.pratiti.Assignment;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		int a,b,d=0;
		String s;
		System.out.println(" Enter 2 numbers : ");
		Scanner sc=new Scanner(System.in);
		a=Integer.parseInt(sc.nextLine());
		b=Integer.parseInt(sc.nextLine());

		System.out.println("   What do you wang + - * /    ");
//		sc=new Scanner(System.in);
		
		s=sc.nextLine();
		
		switch(s) {
		  case "+":
		    d=a+b;
		    break;
		  case "-":
			  d=a-b;
		    break;
		  case "*":
			  d=a*b;
			    break;
		  case "/":
			  d=a/b;
			    break;
		  default:
		    System.out.println("wrong operator");
		}
		
		System.out.println(" Ans = " + d);
		
	}

}
