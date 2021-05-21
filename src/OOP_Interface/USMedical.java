package OOP_Interface;

public interface USMedical extends WHO{

	int min_fee = 10;
	
	//interface cannot have method body
	//only method prototype
	//only method declaration
	//cannot create the object of interface
	//all the variables in interface are static and final by default
	
	
	//Abstract methods: methods without body
	
	//100% abstractions in interface
	
	public void orthoServices();
	
	public void physioServices();
	
	public void cardioServices();
	
	public void emergencyServices();
	
	public void totalDocters(int count);
	
	//after JDK 1.8:
	//1. We can have static methods with body in interface
	
	public static void hospitalAdmin() {
		System.out.println("US - hospitalAdmin");
	}
	
	//after JDK 1.8: we can have default method
	
	public default void billing() {
		System.out.println("US - billing");
	}

}
