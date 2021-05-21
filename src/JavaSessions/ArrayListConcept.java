package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList - dynamic array	
		//ArrayList is a class -- already available in Java
		//It's index-based collection - linear collection
		
		//interview question: how does ArrayList work internally?  how does ArrayList store data dynamically?
		//how does it dynamically increase the value?
		//the moment we add four values or any number of values, Java creates 10 virtual capacities or buckets. the values we add will take 
		//the space of virtual capacity as physical capacity, so the virtual capacity will get less as values are added and the physical
		// capacity will increase. as programmers, we are not bothered about the virtual capacity because it's done internally in Java, rather
		// we should take care of the physical capacity
		//.size is for ArrayList and it gives the size of physical capacity not virtual, and .length is for Array
		
		
		ArrayList ar = new ArrayList();//size: 10 virtual before adding values, but if I 20 inside the ArrayList brackets, the virtual capacity will become 20
		
		System.out.println(ar.size());//size: 0
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());//size: 2
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());//physical capacity/size: 4
		
		ar.add(500);
		ar.add(600);
		ar.add(700);
		
		System.out.println(ar.size());//physical capacity/size: 7
		
		ar.add(800);
		ar.add(900);
		ar.add(1000);
		
		System.out.println(ar.size());//physical capacity/size: 10
		
		ar.add(1100);
		
		System.out.println(ar.size());//physical capacity/size: 11
		
		//how to print all the values from ArrayList? use for loop or for-each loop
		
		for(int num=0; num<ar.size(); num++) {
			System.out.println(ar.get(num));
		}
		
		
		for(Object num2 : ar) { 
			System.out.println(num2); 
		}
		 
		
		
		
		
		
		
		
		
	}

}
