package OOP_Inheritance;

public class BMW extends Car{
	
	//Method Overriding: polymorphism --> (run time/dynamic)
	//when we have a parent class having the same method with the same name and same number of parameters in child class is method overriding

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("Auto parking");
	}
	
	
	//static method can't be overridden in Java
	//Why overriding isn't allowed in static method?
	//because static method is never part of the object, they are part of the Common Memory Allocation CMA
	//@Override
	public static void sunRoof() {
		System.out.println("Car -- sunRoof");
	}
	
	
	//Method overloading: polymorphism --> (compile time), because compiler decides which method has to be called
	public void musicSystem() {
		System.out.println("BMW -- music system");
	}
	
	public void musicSystem(String CD) {
		System.out.println("BMW -- music system" + CD);
	}
	
	public void musicSystem(String radio, double radioFrequency) {
		System.out.println("BMW -- music system" + radio + " Frequency " + radioFrequency);
	}
	
	
}
