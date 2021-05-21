package ConstructorConcept;

public class Employee {

	String name;
	String city;
	String dob;
	int age;
	boolean isPermenant;
	
	//constructor: name of const. will remain same as the class name
	//What is the advantage of constructor? it helps to design the object - what kind of object you want to create...
	//it looks like a function but it's not a function
	//constructor never return a value: no return and no void keywords
	//but function may or may not return a value
	
//	public Employee () {
//		System.out.println("default constructor");
//	}
//	
//	public Employee (int a) {
//		System.out.println("1 param constructor" + a);
//	}
//	
//	public Employee (int a, String b) {
//		System.out.println("2 param constructor" + a+b);
//	}
	
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public Employee(String name, String city, String dob, int age, boolean isPermenant) {
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.age = age;
		this.isPermenant = isPermenant;
	}

	public static void main(String a[]) {

		Employee e1 = new Employee("Asghar");
		
		System.out.println(e1.name);
		
		Employee e2 = new Employee("Anwar", 29);
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3 = new Employee("Abuzer", "Kabul", "2002-4-5", 18, true);
		System.out.println(e3.name + " " + e3.isPermenant);
		
	}

}
