package OOP_Abstract;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LoginPage -- constructor");
	}

	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
		
	}

	@Override
	public void loading() {
		System.out.println("LP -- loading");
		
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with " + un + pwd );
	}
	
	public void doLogin(String un, String pwd, String emailId) {
		System.out.println("login with " + un + pwd + emailId);
	}

}
