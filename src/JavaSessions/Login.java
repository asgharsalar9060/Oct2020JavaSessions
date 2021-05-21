package JavaSessions;

public class Login {

	String username;
	String password;
	String title;
	String url;
	
	public static void main(String[] args) {

		Login googleLogin = new Login();
		
		googleLogin.username = "admin";
		googleLogin.password ="admin123";
		googleLogin.title = "Login";
		googleLogin.url = "http://www.google.com";
		
		System.out.println(googleLogin.username);
		System.out.println(googleLogin.password);
		
		Login amazonLogin = new Login();
		
		amazonLogin.username = "Salar";
		amazonLogin.password = "salar123";
		amazonLogin.url = "http://www.amazon.com";
		
		System.out.println(amazonLogin.title);
		
		Login myLogin = new Login();
		
		myLogin.url = "http://www.myapp.com";
		
		System.out.println(myLogin.username);
		System.out.println(myLogin.password);
		System.out.println(myLogin.title);
		System.out.println(myLogin.url);
		
		
	}

}
