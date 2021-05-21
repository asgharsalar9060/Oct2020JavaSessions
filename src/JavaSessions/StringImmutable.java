package JavaSessions;

public class StringImmutable {
	
	//there is space called string pool inside the heap memory in java

	public static void main(String[] args) {
		
		//new keyword creates new object inside the heap memory and it doesn't go to string pool
		String s1 = new String("Java");
		String s2 = new String("Java");

		//the same object in string pool inside the heap memory but 2 variables inside the stack memory
//		String s1 = "Java";
//		String s2 = "Java";
		
//		s1 = s1.concat(s2);				
//		System.out.println(s1);
		
		
		//String pool: when both references in stack memory are pointing to the same object in heap memory
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		
		
		
		
	}

}
