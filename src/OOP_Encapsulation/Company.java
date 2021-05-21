package OOP_Encapsulation;

public class Company {
	
	public String name;
	public int empCount;//public can be accessed anywhere: inside and outside the class
	private int sharePrice;// private can only be accessed inside the class
	
	public String getCEOName() {
		return "Asghar";
	}
	
	private int totalSharePrice() {
		return 1000;
	}

	public static void main(String[] args) {

		Company obj = new Company();
		obj.name = "IBM";
		obj.empCount = 200;
		obj.sharePrice = 500;
		
		obj.getCEOName();
		
		obj.totalSharePrice();
		
		
		
		
		
		
		
		
	}

}
