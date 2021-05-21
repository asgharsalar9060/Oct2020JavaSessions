package JavaSessions;

public class FinalizeConcept {

	public static void main(String[] args) {

		FinalizeConcept obj = new FinalizeConcept();
		obj = null;
		
		Employee em = new Employee();
		em = null;
		
		System.gc();
		
		System.out.println("Bye");
		
	}
	
	//INTERVIEW QUESTION
	//finalize will be called only when we call the current class before the garbage collector destroys the object 
	//inside the heap memory
	
	@Override
	public void finalize() {
		System.out.println("inside the finalize method...");
	}

}
