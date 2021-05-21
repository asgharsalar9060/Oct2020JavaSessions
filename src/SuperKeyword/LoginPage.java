package SuperKeyword;

public class LoginPage extends Page{
	
	public LoginPage(int time) {
		super(time);
		System.out.println("LoginPage const...");
	}

	int loadTime = 20;
	 void loading() {
		 System.out.println("login page load time: " + loadTime);
		 System.out.println("page load time: "+ super.loadTime);
		 
		 pageTitle();
		 super.pageTitle();
	 }
	 
	 @Override
	 public void pageTitle() {
			System.out.println("login page title");
		}
	

}
