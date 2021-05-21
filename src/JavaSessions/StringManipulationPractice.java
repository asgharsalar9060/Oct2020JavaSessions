package JavaSessions;

public class StringManipulationPractice {

	public static void main(String[] args) {

		String s1 = "I love automation testing using Java";
		
		System.out.println(s1.length());
		
		int len = s1.length();
		
		int li = 0;
		System.out.println(li);
		
		int hi = len-1;
		System.out.println(hi);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(32));
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', s1.indexOf('a')+1));
		System.out.println(s1.indexOf('a', s1.lastIndexOf('a')));
		
		String s2 = "Automation testing";
		
		System.out.println(s2.indexOf("testing")<=s2.length());
		
		if(s2.indexOf("testing")>=0) {
			System.out.println("correct message");
		}
		
		//trim
		
		String s3 = "     Hey there!    ";
		System.out.println(s3.trim());
		
		//replace
		
		String s4 = "05/19/21";
		System.out.println(s4.replace('/', '-'));
		
		String s5 = "I love programming";
		System.out.println(s5.replace("programming", "testing"));
		
		//contains
		
		String s6 = "Testing is all about quality assurance";
		System.out.println(s6.contains("all"));
		
		if(s6.contains("all")) {
			System.out.println("correct");
		}
		
		//concat
		
		String s7 = "Automation";
		String s8 = "testing";
		System.out.println(s7.concat(" " + s8).concat(" and programming"));
		
		//comparison
		
		String s9 = "This is automation testing";
		String s10 = "This is Automation Testing";
		
		System.out.println(s9.equals(s10));
		System.out.println(s9.equalsIgnoreCase(s10));
		
		//substring
		
		String s11 = "This is Java version 1.2.33";
		System.out.println(s11.substring(8));
		System.out.println(s11.substring(0, 12));
		
		String s12 = "100testing";
		
		String sb = s12.substring(0,3);
		System.out.println(sb + 20);
		
		int is = Integer.parseInt(sb);	
		System.out.println(is+20);
		
		//split
		
		String s13 = "Python:Ruby:React:Java:Javascript";
		String strArr[] = s13.split(":");
		
		for(String e : strArr) {
			System.out.println(e);
		}
		
		System.out.println("**************");
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		//FOR INTERVIEW
		
		String test = "xXtestingXxXxJavaxXSelenium";
		
		String testArr[] = test.split("xX");
		
		System.out.println("0th value of: " + testArr[0]);//blank
		System.out.println("1st value of: " + testArr[1]);//testingX
		System.out.println("2nd value of: " + testArr[2]);//xJava
		System.out.println("3rd value of: " + testArr[3]);//Selenium
		
		//String to int
		
		String s15 = "100";
		
		System.out.println(s15+10);//10010
		
		int it = Integer.parseInt(s15);
		
		System.out.println(it+10);//110
		
		//String to double
		
		String s16 = "12.11";
		System.out.println(s16+12);//12.1112
		
		double d = Double.parseDouble(s16);
		
		System.out.println(d+12);//24.11
		
		//int to String
		
		int it2 = 10;
		
		String s17 = String.valueOf(it2);
		
		System.out.println(s17+20);//1020
		
		//double to String
		
		double d2 = 12.11;
		
		String s18 = String.valueOf(d2);
		
		System.out.println(s18+11);//12.1111
		
		//H.W
		
		String y = "Java100";
		
		String s19 = y.substring(4, 7);//String (100)
		
		int it3 = Integer.parseInt(s19);
		
		System.out.println(it3+10);//110
		
		String st = "100testing";
		
		System.out.println(st);
		System.out.println(st+10);
		
		String st2 = st.substring(0,3);
		
		System.out.println(st2);
		int nt = Integer.parseInt(st2);
		System.out.println(nt+10);//110
		
		String st3 = "100";
		
		int nt4 = (Integer.parseInt(st3+10));
		System.out.println(nt4);
		
		//int to String
		int nt3 = 100;
		String st4 = String.valueOf(nt3);
		System.out.println(st4+10);
		
		double d5 = 12.11;
		
		String st6 = String.valueOf(d5);
		System.out.println(st6+11);
		
		
	}

}
