package com.pratiti.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;


public class Example1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
// angular bracket notation < > above called generic
		
		list1.add("abc1");
		list1.add("abc2");
		list1.add("abc3");
		list1.add("abc4");
		list1.add(1,"abc5");
//		list1.add(211);			// ALLOW if generic is empty
		
//		list1.clear();					
//		System.out.println(list1.isEmpty());
//		list1.set(1, "devesh");
		
		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
//		System.out.println(list1.equals(list2));
//		list1.remove("abc1");
//		list1.remove(1);		//remove index value is preferred
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
//		System.out.println(list1.containsAll(list2));
		
		System.out.println("\n\n*****************FOR EACH LOOP");
		for(String i:list1) 
			System.out.println(i);

		System.out.println("\n\n*************LAMBDA");
		list1.forEach(str -> System.out.println(str));
		
		System.out.println("\n\n*************TRADITIONAL ITERATOR API");
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) {
			String str=it.next(); 
			System.out.println(str);
		}
		System.out.println("\n\n\n\n***************************************");
		List<Person> list3 = new ArrayList<>();
		list3.add(new Person("devesh",23));
		list3.add(new Person("deveh",24));
		list3.add(new Person("devsh",25));
		list3.add(new Person("deesh",26));
		list3.add(new Person("dvesh",27));
		
		for(Person i:list3) {
			System.out.println(i.getName() + "  ->  " + i.getAge());
		}
		
//		list1.sort(Comparator_function);
		list3.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
		list3.sort(Comparator.comparing(Person::getName));		// only pass the function name by which comparison will done
		
	}
}
