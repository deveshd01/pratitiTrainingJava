// WrapperClass.java
public class WrapperClass {
	public static void main(String[] args) {
	int a=10;		//Primitive Datatype
	Integer b=10;	//Wrapper class
	Integer c= new Integer(10); // no need to do this as it is taken care of implicitly. same like string class

		int d=c;		//autoboxing  -> converting Integer to int  
		Integer e=10;	//autoboxing  -> converting int to Integer
		
		Integer f=100, g=100;
		System.out.println(f==g);	//true		
		f=1000; g=1000;
		System.out.println(f==g);	// false
		//Integer class does pooling for integer in range -128 to 127
		
//		int x=null;  		//Error
		Integer x=null; 
		
		// similar to string class, wrapper classes are also immutable
		int i=10;  i=20; 			// changing same memory
		Integer I=1000;   I=2000;	// new object getting created & assigning to that value
		
		// to achieve immutability in our code = use only getters (not setters)
		
		//converting Date Types *************************************
		//String to int
		int si=Integer.parseInt("200");
		 	si=Integer.valueOf("200");
		
		//String to Integer
		Integer sI=Integer.parseInt("200");  
		
		//int to String
		String is=Integer.toString(200);
		String numStr = 100 + "";
		String isf=String.format("%d", 123);
		
		//Integer to String
		String Is=Integer.toString(sI);
		
		//double to integer		
		double d2=10.5;  
		int di=(int)d;  
		
		//Double to int
		Double D=10.5;  
		int Di=D.intValue();  
		
		//Double to Integer
		Double D2 = 3452.345;
		Integer DI=D2.intValue();
		
		//double to Integer
		double d3 = 3452.345;
		Integer dI=(int)d2;
		
		//String to double
		
		//String to Double	
	}
}