package JavaSessions;

public class CarDesignTest {

	public static void main(String[] args) {

		CarDesign c1 = new CarDesign();
		c1.name = "BMW";
		c1.color = "Blue";
		c1.price = 70;
		c1.getCarInfo();
		
		CarDesign c2 = new CarDesign();
		c2.name = "Honda";
		c2.color = "Red";
		c2.price = 80;
		
		CarDesign c3 = new CarDesign();
		c3.name = "Bens";
		c3.color = "Black";
		c3.price = 90;
		
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + CarDesign.wheels);
		
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + CarDesign.wheels);
		
		CarDesign.steering();
		
		
		
	}

}
