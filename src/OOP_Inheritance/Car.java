package OOP_Inheritance;


//if we add final to class, this means that the class cannot be a parent class 
//so final keyword is used to prevent inheritance and method overriding
public class Car extends Vehicle{
	
	//if we add final to the method, this means it can't be overridden by the child class
	//what is the advantage of final in method overriding? 
	//if we set a rule that shouldn't be changed by anyone, then no one will be able to do so
	
	int engine = 10;
	
	public void start() {
		System.out.println("car -- start");
	}
	
	public void stop() {
		System.out.println("car -- stop");
	}
	
	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	public static void sunRoof() {
		System.out.println("Car -- sunRoof");
	}
	
	

}
