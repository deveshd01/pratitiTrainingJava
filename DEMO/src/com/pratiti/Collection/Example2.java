package com.pratiti.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// SET
public class Example2 {
	public static void main(String[] args) {

		System.out.println("\n\n*******************    HASH-SET    ********************");
		Set<String> s1 = new HashSet<>();
		s1.add("abc2");
		s1.add("abc1");
		s1.add("abc3");
		s1.add("abc4");
		for (String i : s1)
			System.out.println(i);

		Set<Person> s2 = new HashSet<>();
		s2.add(new Person("devesh", 23));
		s2.add(new Person("deveh", 24));
		s2.add(new Person("devsh", 25));
		s2.add(new Person("deesh", 26));
		s2.add(new Person("dvesh", 27));
		s2.add(new Person("deesh", 26));

		for (Person i : s2) {
			// System.out.println(i.getName() + " -> " + i.getAge());
			System.out.println(i);
		}

		System.out.println("*******************    TREE-SET    ********************");
		Set<String> s3 = new TreeSet<>();
		s3.add("abc2");
		s3.add("abc1");
		s3.add("abc3");
		s3.add("abc4");
		for (String i : s3)
			System.out.println(i);

		System.out.println("*********    comparator class for comparison     ***********");
		class PersonComparator implements Comparator<Person> {
			@Override
			public int compare(Person o1, Person o2) {
				// return type int BCOZ check 3 condition return -1,0,1 return 0 is for removing
				// duplicate
				if (o1.getName().equals(o2.getName()))
					return o1.getAge() - o2.getAge();
				return o1.getName().compareTo(o2.getName());
			}
		}

		Set<Person> s4 = new TreeSet<>(new PersonComparator());
		s4.add(new Person("devesh", 23));
		s4.add(new Person("deveh", 24));
		s4.add(new Person("devsh", 25));
		s4.add(new Person("deesh", 26));
		s4.add(new Person("dvesh", 27));
		s4.add(new Person("deesh", 26));

		for (Person i : s4) {
			// System.out.println(i.getName() + " -> " + i.getAge());
			System.out.println(i);
		}

	}
}
