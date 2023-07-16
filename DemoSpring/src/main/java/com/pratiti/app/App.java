package com.pratiti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.component.ClassWithAnnotation;
import com.pratiti.component.HelloWorld;
import com.pratiti.component.MyClass;
import com.pratiti.component.TextEditor;
import com.pratiti.component.bank.Atm;

public class App {
	public static void main(String[] args) {
		// Loading Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myXMLfile.xml");
		// read XML file & make objects in Memory

//		//Access the object
//		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
//		System.out.println(hw.sayHello("Devesh"));
//		
		// only 1 object is present in memory
//		MyClass obj = (MyClass) ctx.getBean("myC");
//		obj.fun();
//		obj.d=25;
//		MyClass obj2 = (MyClass) ctx.getBean("myC");	// referencing to same object
//		obj2.d=55;
//		MyClass obj3 = new MyClass();					// creating new object
//		obj3.d=55;
//		System.out.println(obj.d + " ->  " + obj2.d+ " ->  " + obj3.d); 	

//		ClassWithAnnotation annoObj = (ClassWithAnnotation) ctx.getBean("compoName");
//		annoObj.fun();

//		TextEditor te = (TextEditor) ctx.getBean("textE");
//		te.load("abc.txt");

		Atm atm = (Atm) ctx.getBean("hdfcAtm");
		atm.withdraw(2222, 22);

	}

}
