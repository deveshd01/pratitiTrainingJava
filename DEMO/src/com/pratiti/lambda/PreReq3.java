package com.pratiti.lambda;


class H{
	protected int a=20;
	void hello() {		System.out.println("Helloooooooooooooo");	}
}

class hi extends H{
	void hello() {		System.out.println("Hiiiiiiiiiiiiiii");	}
}

public class PreReq3 {
	public static void main(String[] args) {
		 int d=123;
		
		H obj=new H();
		obj.hello();
		
		H obj2=new hi();
		obj2.hello();
		
		// Anonymous inner class  // creating subclass of class_H	
		//	Anonymous inner class can implement an interface or extend a class
		H cl = new H() {
			void hello() {	System.out.println("Anonymous........."+this.a + d);	}
		};
		cl.hello();
	}
}
