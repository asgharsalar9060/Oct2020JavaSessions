package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		
		lp.header();
		lp.title();
		lp.loading();
		lp.url();
		lp.doLogin("admin", "admin");
		
		
		Page.logo();
		
		//top casting: child class object can be referred by parent class reference variable
		
		Page p = new LoginPage();
		p.header();
		p.loading();
		p.title();
		
		//down casting: not possible
		
	}

}
