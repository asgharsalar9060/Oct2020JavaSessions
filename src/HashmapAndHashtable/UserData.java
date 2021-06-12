package HashmapAndHashtable;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {

		//HashMap<String, String> userMap1 = new HashMap<String, String>();
		
		Map<String, String> userMap2 = new HashMap<String, String>();
		
		userMap2.put("id", "123");
		userMap2.put("name", "Ali");
		userMap2.put("city", "VA");
		
		System.out.println(userMap2.size());
		
		System.out.println(userMap2.get("name"));
		
		for(Map.Entry e : userMap2.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
	}

}
