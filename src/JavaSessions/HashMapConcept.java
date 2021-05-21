package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap: key-value
		
		HashMap<String, String> empMap = new HashMap<String, String>();// HashMap does not store data on the basis of indexing
		
		//What is the default virtual capacity of HashMap? it's 16
		
		//what is collision in HashMap? when 2 values come to the same position and the position converts it into Link List - different nodes will be created
		
		//ArrayList is order-based: indexes; 0 1 2 3...
		//HashMap is non-order-based: no index
		
		//HashMap is a class which implements map interface 
		//extends AbstractMap
		//it contains unique elements
		//store values on the basis of key-value pair
		//it may have one null key and multiple null values
		//in maintains no order - no index
		
		
		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Salar");
		empMap.put("D", "Noori");
		
		System.out.println(empMap.get("B"));
		
		System.out.println(empMap.size());
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selemnium");
		hm.put(2, "Testing");
		hm.put(3, "Automation");
		hm.put(4, "Java");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(hm);
		
		hm.remove(3);
		
		System.out.println(hm);
		
		
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Salar", 100);
		marks.put("Mushtaq", 200);
		marks.put("Noori", 300);
		marks.put("Hashim", 400);
		marks.put("Noorzai", 500);
		
		System.out.println(marks.get("Noori"));
		
		//hashing: hashcode() --> hashing
		
		//hashcode of Noori -- 234566
		//index - 13
		//.equals to check the key name
		//Noori
		//return value -- 300
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
