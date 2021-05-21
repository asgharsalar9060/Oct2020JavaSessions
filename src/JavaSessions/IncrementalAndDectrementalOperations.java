package JavaSessions;

public class IncrementalAndDectrementalOperations {

	public static void main(String[] args) {
		
		//Post increment
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -99;
		int d = c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		int g = -1000;
		int h = g++;
		System.out.println(g);
		System.out.println(h);
		
		//Pre increment
		int m = 1;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
		
		int l = -100;
		int p = ++l;
		System.out.println(l);
		System.out.println(p);
		

		//Post decrement
		int x = 2;
		int y = x--;
		System.out.println(x);//1
		System.out.println(y);//2
		
		int x1 = 99;
		int x2 = x1--;
		System.out.println(x1);
		System.out.println(x2);
		
		//Pre decrement
		int y1 = 99;
		int y2 = --y1;
		System.out.println(y1);
		System.out.println(y2);
		
		//************************
		
		int total = 100;
		System.out.println(total++);//100
		System.out.println(total);//101
		
		int bal = 999;
		System.out.println(++bal);//1000
		
		double d1 = 99.99;
		System.out.println(++d1);
		
		char c1 = 'a';//97
		System.out.println(++c1);//b
	}

}
