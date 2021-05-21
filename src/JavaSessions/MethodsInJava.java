package JavaSessions;

public class MethodsInJava {

	//cannot  create a method inside a method
	
	
	public static void main(String[] args) {

		//create the object
		//object will never store static method
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		int in = obj.getMarks();
		System.out.println(in);
		
		String st = obj.getName();
		System.out.println(st);
		
		int in2 = obj.sum(10, 11);
		System.out.println(in2);
		
		System.out.println(obj.sum(12, 12));//not a good method
		
	}
	
	//1. no input and no return
	//void: does not return any value
	//return type: void
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input but some return
	//return type: int
	public int getMarks() {
		System.out.println("get marks");
		int total = 100;
		int bonus = 50;
		int totalmarks = total + bonus;
		return totalmarks;
	}
	
	public String getName() {
		System.out.println("get name");
		String s = "Asghar";
		return s;
	}
	
	//3. some input and some return
	
	public int sum(int a, int b) {
		System.out.println("sum method");
		int z = a + b;
		return z;
	}
	
	
	

}
