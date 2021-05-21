package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.login("admin", "admin123");
		
		lp.search("iPhone-12", 3000);
		
		lp.doPayment(1234867634, 345);

	}

	// Method Overloading: Object Oriented Programming OOP - Poly+Morphism: poly
	// means many and morphism means forms
	// PolyMorphism: includes method overloading + method overriding
	// This method overloading is also called (compile time)
	// within the same class, when we have different methods
	// with the same name
	// different input parameters
	// sequence of the parameters is also different
	
	//What is the advantage of method overloading? Readability and flexibility for the user point of view

	public void login() {// 0 input
		System.out.println("login to app");
	}

	public void login(int a) {// 1 input
		System.out.println("login to app");
	}

	public void login(int a, int b) {// 2 input
		System.out.println("login to app");
	}

	public void login(int a, String b) {// 2 input
		System.out.println("login to app");
	}

	public void login(String a, int b) {// 2 input
		System.out.println("login to app");
	}

	public void login(String ur, String pwd) {// 2 input
		System.out.println("login to app with " + ur + " and " + pwd);
	}

	// Method Overloading: practical example

	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {
		System.out.println("product name: " + name + " and " + "product price: " + price);
	}

	public void search(String name, int price, String color) {

	}

	public void search(String sellerName, int price, boolean available) {

	}

	// Method Overloading: practical example

	public void doPayment(String UPI) {

	}

	public void doPayment(String UPI, long phone) {

	}

	public void doPayment(long cc, int cvv) {
		System.out.println("payment with: " + cc + " and " + "cvv " + cvv);
	}

	public void doPayment(long phone, String pwd) {

	}

}
