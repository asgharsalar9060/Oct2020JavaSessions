package JavaSessions;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// What is HashTable? How does it work internally?
		
		//HashTable is synchronized: it does not allow any null key and null value
		//initial capacity of HashTable is 11, lower factory is 0.75
		
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		
		marks.put("Salar", 100);
		marks.put("Mushtaq", 200);
		marks.put("Noori", 300);
		marks.put("Hashim", 400);
		marks.put("Noorzai", 500);
		//marks.put(null,600);
		
		System.out.println(marks.get("Hashim"));
		System.out.println(marks.get("Salar"));
		System.out.println(marks.get(null));//null key and null value is not allowed
		
		
		

	}

}
