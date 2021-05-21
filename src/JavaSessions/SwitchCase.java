package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {

		//switch-case
		
		String browser = "opera";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("Please pass the correct browser " + browser);
			break;
		}
		
		
		//int
		
		int marks = 90;
		int discount = 0;
		
		switch (marks) {
		case 100:
			System.out.println("grade A");
			discount = 1000;
			break;
		case 90:
			System.out.println("grade B");
			discount = 800;
			break;
		case 80:
			System.out.println("grade C");
			discount = 500;
			break;

		default:
			break;
		}
		
		System.out.println("Your mark is: " + marks + " and you discount is: " + discount);
		
		//switch-cases for float and double values are not allowed
		//switch-cases for characters is allowed and it takes their ASCII values
	}

}
