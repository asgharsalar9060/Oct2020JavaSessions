package JavaSessions;

public class LoopsConecept {

	public static void main(String[] args) {

		//1 to 10
		
		//1. while loop:
		
		int i = 1;//initialization
		while(i <= 10) {//condition
			System.out.println(i);//statement
			//i=i+1;
			//i++;
			++i;//increment/decrement
		}
		
		System.out.println("===============================");
		
		//1 to 10
		
		//2. for loop:
		
		for (int j=1; j<=10; j++) {
			System.out.println(j);
		}
		System.out.println("===============================");
		for (int j=1; j<=10; ) {
			System.out.println(j);
			j++;
		}
		
		//interview question: what is the condition here? what's the result? it will print infinite loop because it will consider the condition true by default
		
		 //for(; ;) { System.out.println("Hello"); }
		 
		System.out.println("===============================");
		
		//a to z:
		
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}
		
		System.out.println("===============================");
		//double:
		for(double d=1.1; d<10; d++) {
			System.out.println(d);
		}
		
		boolean flag = false;
		while(flag) {
			System.out.println("Hi");
		}
		
		System.out.println("===============================");
		//3. do-while:
		
		int p = 1;
		do{
			System.out.println(p);
			p++;
		}
		while (p<=10);
		
		System.out.println("===============================");
		//4.for-each loop:
		//5.streams: JDK 8 for array list:
		//6.for each loop method - JDK 8
		
		//typical for loop:
		int marks [] = new int[5];
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		marks[4] = 500;
		for(int a=0; a<5; a++) {
			System.out.println(marks[a]);
		}
		
		//for-each loop:
		for(int e : marks) {
			System.out.println(e);
		}
		
		System.out.println("===============================");
		
		//WAP to print even numbers (2 to 10)
		//2 4 6 8 10:
		for(int even = 2; even<=10; even=even+2) {
			System.out.println(even);
		}
		
		System.out.println("===============================");
		
		//another way by % operator:
		
		for(int even2 = 2; even2<=10; even2++) {
			if(even2 % 2 == 0) {
				System.out.println("even numbers: " + even2);
			}
		}

		
		System.out.println("===============================");
		//WAP to print even numbers (1 to 10)
		
		for(int odd = 1; odd < 10; odd=odd+2)
			System.out.println(odd);
		
		System.out.println("===============================");
		for(int odd2 = 1; odd2 < 10; odd2++) {
			if(odd2 % 2 == 1) {
				System.out.println("odd numbers: " + odd2);
			}
		}
		
		
		System.out.println("===============================");
		
		//for loop with if condition:
		//1 to 100:
		//when I find a number divisible by 5
		//then print "Hi"...
		
		for(int hi=1; hi<=100; hi++) {
			System.out.println(hi);
			if(hi % 5 == 0) {
				System.out.println("Hiiiiiiiii");
				break;
			}
		}
		
		
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		
		for(int ma=0; ma<=5; ma++) {
			
			for(int na=0; na<=5; na++) {
				
				System.out.print(ma+ "" + na + " ");
			}
			System.out.println();
		}
		
		//000 001 002 003 004 005
		//010 011 012 013 014 015...
		
		for(int pa=0; pa<=5; pa++) {
			for(int pq=0; pq<=5; pq++) {
				for(int ps=0; ps<=5; ps++) {
					System.out.print(pa + "" + pq + "" + ps + " ");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
	}

}
