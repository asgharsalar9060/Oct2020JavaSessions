package JavaSessions;

public class StringContact {
	
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		System.out.println(s1);
		
		String s2 = "1000";
		System.out.println(s2);
		
		double d1 = 12.22;
		double d2 = 11.33;
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+d1+d2+x+y);
		System.out.println(x+y+a+b+d1+d2);
		
		System.out.println("this value of a is " + a);
		System.out.println("this value of b is " + b);
		System.out.println("the sum of a and b are " + (a+b));
		
//		-->a-z: 97-122
//		-->A-Z: 65-90
//		-->0-9: 48-57
		
		char c = 'a';
		char c1 = 'b';
		System.out.println(c+c1);
		System.out.println(c);
		System.out.println(x+c);
		System.out.println(c1-c);
		
		System.out.println(4/2);
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		
		//System.out.println(9/0);arithmeticException
		System.out.println(0/10);
		
		System.out.println(4 % 2);
		System.out.println(5 % 2);
	}

}
