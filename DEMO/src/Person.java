import java.util.Objects;

// Person.java
public class Person {
	private String name;
	private int age;
	
	public Person() {
		this.name = "Devesh";
		this.age = 23;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// for making .equals() Working
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person) obj;
//		
//		return this.name.equals(p.name) && this.age==p.age;
//	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

// for making println Working
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person p1=new Person("Rohit",22);
		System.out.println(p1.getName()+"  ->  "+p1.getAge());
		System.out.println(p1);
		
		Person p2=new Person("Rohit",22);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));	
	}
}
