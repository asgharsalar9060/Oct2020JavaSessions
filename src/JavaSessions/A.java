package JavaSessions;

public class A {

	//interview question: can we call one main method class inside another one? yes!
	
	public static void main(String[] args) {
		
		System.out.println("A - main");

		B.main(args);
		
		//StackOverflowError: when the common memory allocation (CMA) memory is full, it gives such an error
		//heap memory is divided into 3 parts: young generation, survival 1 and survival 2
		//first object will be stored inside the young generation
		//once the young generation gets full, object will move to survival 1 and 2
		//once all the heap memory is full, garbage collector will come to the young generation and destroys
		//the objects that are without reference and null values
		//and another garbage collector will come to survival 1 and 2 and do the same
		
		
	}

}
