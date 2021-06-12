package HashmapAndHashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapAndHashTableConcept {

	public static void main(String[] args) {
		
		//HashMap vs HashTable
		
		//HashMap is not synchronized -- not thread safe
		//HashMap: only one null and key and multiple values
		
		//Hashtable: no null key and no null value

		// HashMap

		HashMap<String, String> userData = new HashMap<String, String>();

		userData.put("id", "1234");
		userData.put("name", "Ali");
		userData.put("city", "CA");
		userData.put(null, "VA");
		userData.put(null, "DC");
		userData.put("company", null);

		System.out.println(userData);

		System.out.println(userData.size());

		System.out.println(userData.get("city"));

		for (Map.Entry e : userData.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		System.out.println("********************");

		// HashTable

		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();

		productTable.put("Air Mac", 1234);
		productTable.put("iPhone X", 1200);
		productTable.put("Dell", 1300);
		//productTable.put(null, null);//NullPointerException
		
		System.out.println(productTable.get("Air Mac"));
		System.out.println(productTable.size());
		
		System.out.println(productTable);

		for(Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
