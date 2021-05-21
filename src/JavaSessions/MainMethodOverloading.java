package JavaSessions;

public class MainMethodOverloading {

	public static void main(String a[]) {
		// interview question: can we overload the main method? 
		// yes, but JVM will only call the main method with one string array argument
		
		System.out.println("Hello world");
		System.out.println(a.length);
		//System.out.println(a[0]);//ArrayIndexOutOfBoundException
		
		main(10);
		main(10, 20);
		main(10, " apples");

	}
	
	public static void main(int a) {
		
		System.out.println(a);
	}
	
	public static void main(int a, int b) {
		
		System.out.println(a + b);
	}
	
	public static void main(int a, String b) {
		
		System.out.println(a + b);
	}

}
