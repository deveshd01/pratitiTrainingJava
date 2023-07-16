package com.pratiti.exceptionHandling;

public class Example1 {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
// arr[15]=100;			//ArrayIndexOutOfBoundsException
		String str = null;
// str.toUpperCase();		//NullPointerException
// int x=5/0;		//Arithmetic Exception	
// int y=Integer.parseInt("123");		//NumberFormatException

		try {
			arr[15] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error occured in TRY block");
		} finally {
			System.out.println("Always Print In any Case");
		}
		System.out.println("This print if no Error in CATCH block");
		
		
		
		
	}
}
