package JavaSessions;

public class StringManipulationConcepts {

	public static void main(String[] args) {

		String str = "This is my Java code and I am so happy";
		System.out.println(str.length());
		
		int len = str.length();
		
		int li = 0;
		System.out.println(li);
		int hi = len-1;
		System.out.println(hi);
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(37));
		
		System.out.println(str.indexOf('a'));//1st occurrence of a
		System.out.println(str.indexOf('a'));//3rd or 4th position of a --> ???
		
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('s'));//1st occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//2nd occurrence of s
		System.out.println(str.indexOf('s', str.lastIndexOf('s')));//last occurrence of s
		
		System.out.println(str.indexOf("Java"));
		
		System.out.println(str.indexOf("Hello"));
		
		String msg = "Welcome admin";
		
		if(msg.indexOf("admin")>=0) {
			System.out.println("correct message");
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//trim: removing the space
		
		String str2 = "     hello world     ";
		System.out.println(str2.trim());
		
		String str3 = "    12324";
		System.out.println(str3.trim());
		
		//replace: replacing a char, string...
		
		String dob = "27-7-1994";
		System.out.println(dob.replace('-', '/'));
		
		String str4 = "Hello Java, I like you Java...";
		System.out.println(str4.replace("Java", "Python"));
		
		//contains
		
		String str5 = "Welcome admin";
		
		System.out.println(str5.contains("admin"));
		
		if(str5.contains("admin")) {
			System.out.println("correct message");
		}
		
		//concat
		
		String str6 = "Hello ";
		String str7 = "Selenium";
		
		System.out.println(str6.concat(str7));
		System.out.println(str6.concat(str7).concat(" Automation testing"));
		
		//comparison
		
		String str8 = "This is my java code";
		String str9 = "This is my Java code";
		
		System.out.println(str8.equals(str9));//false
		System.out.println(str8.equalsIgnoreCase(str9));//true
		
		//substring: used to fetch a smaller string from a larger string
		
		String str10 = "This is my order Id 123";
		System.out.println(str10.substring(11));
		System.out.println(str10.substring(0, 9));
		
		System.out.println(str10.substring(str10.indexOf("Id")+3, str10.length()));
		
		//split
		String test = "Java:Javascript:Python:Ruby";
		String arr[] = test.split(":");
		
		System.out.println(arr[0]); 
		
		for(String s :arr) {
			System.out.println(s);
		}
		
		String userData = "Asghar:Salar:26:Tester:DC:";
		String user[] = userData.split(":");
		
		for(int i=0; i<user.length; i++) {
			System.out.println(user[i]);
		}
		
		//FOR INTERVIEW: about split
		String data = "xXtestingXxXxJavaxXSelenium";
		
		String dataArray[] = data.split("xX");
		
		System.out.println("0th value: " + dataArray[0]);//blank
		System.out.println("1st value: " + dataArray[1]);//testingX
		System.out.println("2nd value: " + dataArray[2]);//xJava
		System.out.println("3rd value: " + dataArray[3]);//Selenium
		
		//string to int
		
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//H.W.: split 200testing and then convert 200 to int and then add 20 to get 220
		
//		String y = "200testing";
//		
//		System.out.println(y+20);
//		
//		int i2 = Integer.parseInt(y);//NumberFormatException
//		System.out.println(i2+20);
		
		//string to double
		
		String ds = "12.33";
		
		System.out.println(ds+100);
		
		double d = Double.parseDouble(ds);
		System.out.println(d+100);
		
		//int to string
		
		int total = 10;
		System.out.println(total+20);
		
		System.out.println(total+""+20);//1020
		
		String st = String.valueOf(total);//1020
		System.out.println(st+20);
		
		//double to string
		
		double df = 12.11;
		System.out.println(df+""+12);
		
		String sd = String.valueOf(df);
		System.out.println(sd+12);
	}

}
