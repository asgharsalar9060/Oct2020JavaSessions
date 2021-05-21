package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inheritance
		b.refuel();//inheritance
		b.autoParking();//child class
		System.out.println(b.engine);//calling a variable from parent class 
		BMW.sunRoof();//not calling by the object because it's not part of the object
		b.engine();
		
		b.musicSystem();
		b.musicSystem("Ballywood");
		b.musicSystem("Arman", 95.3);
		
		Car c = new Car();
		c.start();
		c.start();
		c.refuel();
		System.out.println(c.engine);//calling a variable from parent class
		BMW.sunRoof();//not calling by the object because it's not part of the object
		c.engine();
		
		//interview question: why can't we call a method from child class?
		//Java creates a reference type check, if an object is from the child class that's inherited or overridden from parent class,
		//the object will not be called
		
		//Top casting:
		Car c1 = new BMW();//child class object can be referred by parent class reference variable
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		//Down casting:
		//down casting is allowed at compile time
		// down casting is not allowed in the run time --> interview question
		//we cannot convert car into BMW because every car can't be BMW so it gives exception
		//BMW b1 = (BMW)new Car();//ClassCastException --> will be thrown at run time
		
		
		
	}

}
