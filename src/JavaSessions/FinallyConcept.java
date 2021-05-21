package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {

		int a = 10;

		try {
			int b = a / 2;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		} finally {
			System.out.println("inside finally block");
		}

		System.out.println("Bye!");

		System.out.println(getMarks("Asghar"));
	}
	
	public static int getMarks(String name) {
		if(name.equals("Asghar")) {
			try {
				int i = 9/0;
			}
			catch(Exception e) {
				return 80;
			}
			finally {
				System.out.println("Bye");
				return 25;
			}
			
		}
		else if(name.equals("Anwar")) {
			return 150;
		}
		else {
			System.out.println("result not found...");
			return -1;
		}
		
	}

}
