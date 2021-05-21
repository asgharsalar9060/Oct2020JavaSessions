package JavaSessions;

public class StaticAndNonStaticConcept {

	String name;
	static int age;
	
	public void getName() {
		System.out.println("get name");
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	
	public static void main(String[] args) {

		//how to access non static variables and methods?
		//we have to create the object of the class
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		obj.name = "Asghar";
		System.out.println(obj.name);
		
		obj.getName();
		
		//how to access static variables and methods?
		//1. we can call them directly: no need to create object
		
		age = 25;
		System.out.println(age);
		
		getInfo();
		
		//2. we can call them using class name
		
		StaticAndNonStaticConcept.age = 50;
		System.out.println(age);
		
		StaticAndNonStaticConcept.getInfo();
		
		//3. Can I use Object to call static vars and methods?
		// yes but it gives warning
		
		obj.age = 40;
		obj.getInfo();
	}

}
