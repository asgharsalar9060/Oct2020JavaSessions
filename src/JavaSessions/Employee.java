package JavaSessions;

public class Employee {

	//class variables: global variables
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	@Override
	public void finalize() {
		System.out.println("inside the Employee class finalize method...");
	}
	
	public static void main(String[] args) {

		//class is an entity or template used to define the objects
		//object(e.g: Employee) is stored in heap memory in Java
		//object variable (e.g: em) is stored in stack memory in Java -- stack memory: last in, first out; LIFO
		
		Employee em = new Employee();
		
		em.name = "Tom";
		em.age = 25;
		em.salary = 34.45;
		em.isActive = true;
		
		System.out.println(em.name);
		System.out.println(em.age);
		System.out.println(em.salary);
		System.out.println(em.isActive);
		
		Employee em2 = new Employee();//
		
		em2.name = "Peter";
		em2.age = 26;
		em2.salary = 34.45;
		em2.isActive = false;
		
		System.out.println(em2.name + " " + em2.age + " " + em2.salary + " " + em2.isActive);
		
		new Employee();//this object has no reference and will be deleted or destroyed from heap memory and go to garbage collector
		
		Employee em3 = new Employee();
		em3 = null;//object with null reference will be deleted or destroyed from heap memory and go to garbage collector
		
		//System.gc();//garbage collector - it's only for heap memory, not for stack memory
		
		em3.name = "Testing";//i can't access this because the object is referenced to null: NullPointerException
		
		
	}

}
