package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		 
		//BIG O
		
		int i = 10;// What is the time complexity of this? O(1) because it will be executed only once
		
		System.out.println(i);//O(1)
		
		int  p = 10+20;
		System.out.println(p);//O(1)
		
		for(int k=1; k<=10; k++) {
			System.out.println(k);//O(10) --> O(n)
		}
		
		//interview question: How will you calculate the time complexity?
		
		
		
		
	}
	
	
}
