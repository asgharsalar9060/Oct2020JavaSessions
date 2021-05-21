package JavaSessions;

public class CallingOneMethodInsideAnotherMethod {

	public static void main(String[] args) {
		
		CallingOneMethodInsideAnotherMethod p1 = new CallingOneMethodInsideAnotherMethod();
		p1.getName();

	}

	//interview question: can we call one method inside another method without creating the object?
	//yes
	
	public void getName() {
		getAddress();
		getPhone();
	}

	public void getAddress() {
		getPhone();
		System.out.println("UB, 124st.");
	}

	public void getPhone() {
		getName();
		System.out.println("Asghar Salar");
	}

	public void getInfo() {
		getPhone();
		System.out.println("976122343");
	}


}
