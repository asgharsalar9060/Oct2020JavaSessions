package OOP_Encapsulation;

public class Employee {
	
	//encapsulation is also data-hiding concept; we don't allow others to see our data
	
	public String name;
	public int age;
	private int salary;
	private String address;
	
	//public getter and setter methods:

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
