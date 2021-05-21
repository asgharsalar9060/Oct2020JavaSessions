package OOP_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		Employee obj = new Employee();
		
		obj.setSalary(1000);
		System.out.println(obj.getSalary());
		
		obj.setSalary(5000);
		System.out.println(obj.getSalary());
		
		obj.setAddress("Bayanmongol, 26th st.");
		System.out.println(obj.getAddress());
		
	}

}
