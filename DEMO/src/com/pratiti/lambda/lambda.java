package com.pratiti.lambda;



@FunctionalInterface				// interface with only abstract method
interface Printer{
	void print(String document);
}

class DeskjetPrinter implements Printer{

	@Override
	public void print(String document) {
		System.out.println("DeskJet   :   "+document);
		
	}
}

interface Math{
	int add(int x, int y);
}

public class lambda {
	public static void main(String[] args) {
		Printer p1= new DeskjetPrinter();
		p1.print("abc.txt");
		
		//anonymous implementation of Printer interface
		Printer p2 = new Printer() {
			
			@Override
			public void print(String document) {
				System.out.println("Anonymous   :   "+document);
				
			}
		};
		p2.print("abc.txt");
		
		
		// lambda based implementation of Printer interface
		Printer p3 = (document) -> {
			System.out.println("lambda   :   "+document);
		};
		p3.print("abc.txt");
		
		Printer p4 = (document) -> System.out.println("lambda   :   "+document);

		
		Math m2 = new Math() {
			@Override
			public int add(int x, int y) {				
				return x+y;
			}
		};
		
		Math m3 = (a,b)->a+b;
		
	}
}
