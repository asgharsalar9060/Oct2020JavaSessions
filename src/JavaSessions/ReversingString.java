package JavaSessions;

public class ReversingString {

	public static void main(String[] args) {

//		String s1 = "Selenium";//muineleS
//		
//		int len = s1.length();
//		String rev = "";
//		
//		for(int i = len-1; i>=0; i--) {
//			rev = rev + s1.charAt(i);			
//		}	
//		System.out.println(rev);
		
		
		//System.out.println(reverseString(null));
		
		String s1 = "Selenium";
		StringBuffer sb = new StringBuffer(s1);//in Java StringBuffer is mutable unlike other strings
		StringBuffer s2 = sb.reverse();
		System.out.println(s2);
	}
	
	public static String reverseString(String value) {
		
		if(value == null) {
			System.out.println("you are passing a null value...");
			return null;
		}
		
		int len = value.length();
		if(len == 1) {
			return value;
		}
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			rev = rev + value.charAt(i);			
		}	
		return rev;
	}

}
