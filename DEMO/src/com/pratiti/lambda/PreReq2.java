package com.pratiti.lambda;

// Inner Class
class A{
	private int x=10;
	//
	class B{			// Inner class  // class can access private variable
		void check() {
			System.out.println(x);
			A a=new A();
			System.out.println(a.x);
		}
	}
	// static inner class
	static class C{
		void check() {
			System.out.println("okkk..........");
		}
	}
}

public class PreReq2 {
	public static void main(String[] args) {
		A.B ab=new A().new B();		// object of inner class
		
		A a=new A();				// object of Outer class
		A.B b=a.new B();			// object of inner class
		
		A.C ac= new A.C();			// static are not accessed by constructor
	}
}

