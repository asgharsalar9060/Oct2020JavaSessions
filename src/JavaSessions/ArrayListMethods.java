package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("A");
		ar.add("B");
		ar.add("C");
		
		System.out.println(ar);
		
		System.out.println(ar.size());
		
		ar.clear();
		
		System.out.println(ar);
		
		System.out.println(ar.size());
		
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		ar1.add("D");
		System.out.println(ar1);
		
		//clone:
		
		ArrayList<String> ar2 = (ArrayList<String>)ar1.clone();//shallow copy
		System.out.println(ar2);
		
		//contains:
		
		System.out.println(ar1.contains("C"));
		System.out.println(ar1.contains("F"));
		
		System.out.println(ar1.indexOf("B")>0);
		
		ArrayList<String> ar3 = new ArrayList<String>(2);//the virtual capacity is 2
		
		ar3.add("test");
		ar3.add("selenium");
		
		System.out.println(ar3);
		
		//interview question: how do we increase the capacity of ArrayList(virtual capacity)? We can use ensureCapacity
		//why do we need the virtual capacity? what's the use of it? for memory management purpose
		
		ar3.ensureCapacity(15);//the virtual capacity increased to 15 now
		
		//for-each: JDK 1.8 with lambda
		
		ar1.forEach(name -> System.out.println(name));// -> means that the value of name will be supplied to System.out.println(name)
		
		ar1.forEach(name1 -> System.out.println(name1.toLowerCase()));//print the values in lower case
		
		
		
		ArrayList<String> empList = new ArrayList<String>();
		
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Asghar");
		empList.add("Anwar");

		System.out.println(empList);
		
		Collections.sort(empList);//sort values alphabetically 
		
		System.out.println(empList);
		
		Collections.sort(empList, Collections.reverseOrder());// sort in descending order
		
		System.out.println(empList);
		
	}

}
