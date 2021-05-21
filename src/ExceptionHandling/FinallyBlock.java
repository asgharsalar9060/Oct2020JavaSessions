package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e){
			System.out.println("Exception is here...");
		}
		finally {
			System.out.println("Bye...");
		}
		
		//interview question: When do we use finally block?
		
		//for example:
		//make connection with DB
			//db is down -- exception
			//un, pwd -- wrong -- exception
			//connectivity issue -- exception
		//connection is done...
		
		//get the data using SQL -- exception
		//use that data
		//close the connection -- finally block
		
		System.out.println(getMarks("Meqdad"));
	}
	
	//INTERVIEW QUESTION
	
	public static int getMarks(String name) {
		if(name.equals("Asghar")) {
			return 100;
		}
		else if(name.equals("Meqdad")) {
			try {
				int i = 9 / 0;
				return 69;
			}catch(Exception e) {
				return 90;
			}finally {
				System.out.println("inside finally block");
				return 10;
			}
		}
		else if(name.equals("Anwar")) {
			return 94;
		}
		return -5;
	}
	
	
	
	
	
	
	
	
	
	

}
