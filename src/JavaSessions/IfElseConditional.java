package JavaSessions;

public class IfElseConditional {

	public static void main(String[] args) {

		//< > == != <= >=
		
		int a = 10;
		int b = 20;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");
		}
		
		//Interview question: what do you mean by dead code?
		if(true) {
			System.out.println("Testing");
		}
		else {
			System.out.println("Development");//dead code
		}
		
		if(false) {
			System.out.println("Testing");//dead code
		}
		else {
			System.out.println("Development");//dead code
		}
		
		
		String s1 = "Selenium";
		String s2 = "selenium";
		if(s1.equals(s2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		}
		
		
		//Nested if:
		int marks = 60;
		
		if(marks>=60) {
			System.out.println("A grade");
				if(marks<=80) {
					System.out.println("B grade");
						if(marks<=60) {
							System.out.println("C grade");
						}
				}
		}
		else {
			System.out.println("Fail");
		}
		
		//
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch firefox");
		}
		if(browser.equals("safari")){
			System.out.println("Launch safari");
		}
		
		//if-elseif
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("Please pass the correct browser");
		}
			
		//Interview question
		//WAP (write a program) - to find out the max number where three different numbers are given
		
		int x = 700;
		int y = 600;
		int z = 800;
		
		if(x > y && x > z) {//true && false = false
			System.out.println("x is the greatest number");
		}
		else if(y > z) {//false
			System.out.println("y is the greatest number");
		}
		else{
			System.out.println("z is the greatest number");
		}
		
		
		//WAP (write a program) - to find out the max number where four different numbers are given
		
		int m = 10; 
		int n = 16;
		int p = 15;
		int q = 13;
		
		if(m > n && m > p && m > q) {
			System.out.println("m is the greatest number");
		}
		else if(n > p && n > q) {
			System.out.println("n is the greatest number");
		}
		else if(p > q) {
			System.out.println("p is the greatest number");
		}
		else {
			System.out.println("q is the greatest number");
		}
		
		
		double d1 = 10.12;
		double d2 = 10.12;
		if(d1 == d2) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		char c1 = 'a';
		char c2 = 'a';
		if(c1 == c2) {
			System.out.println("Hello");
		}
		
		if(c1 == 97) {
			System.out.println("Hey");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
