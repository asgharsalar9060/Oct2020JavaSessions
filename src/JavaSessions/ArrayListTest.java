package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//Why is ArrayList so important in automation testing? because of its dynamic behavior
		//What is the default capacity of ArrayList? It's 10 and it's virtual capacity not physical
		
		
		ArrayList<Object> ar = new ArrayList<Object>();//We can use Object in order to use different data types in ArrayList - Object is the super class of all classes
		
		ar.add(100);
		ar.add("Testing");
		ar.add('m');
		ar.add(12.12);
		ar.add(true);
		
		System.out.println(ar.get(0));
		
		//Generic in ArrayList:
		
		//int arraylist
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);//index 0
		marksList.add(200);//index 1
		marksList.add(300);//index 2
		
		System.out.println(marksList.get(0));
		//System.out.println(marksList.get(3));//IndexOutOfBoundsException
		
		//string ArrayList:
		
		ArrayList<String> namesList = new ArrayList<String>();
		
		namesList.add("Divya");
		namesList.add("Kajol");
		namesList.add("Amir");
		
		System.out.println(namesList.size());
		//namesList.remove(1);
		System.out.println(namesList.size());
		
		System.out.println(namesList.get(1));
		
		for(int num=0; num<namesList.size(); num++) {
			System.out.println(namesList.get(num));
		}
		
		for(String num2 : namesList) {
			System.out.println(num2);
			
				if(num2.equals("Amir")) {//we can use if inside for loop as well
					System.out.println("Amir is found...");
				}
		}
		
		
		
		
		
		
	}

}
