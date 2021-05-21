package OOP_Encapsulation;

public class WebDriver {

	public void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			launchChrome();
		}
		else if(browser.equals("firefox")) {
			launchFirefox();
		}
		else {
			System.out.println("Please pass the correct browser");
		}
	}
	
	
	private void launchChrome() {
		System.out.println("check chrome version");
		System.out.println("check OS version");
	}
	
	private void launchFirefox() {
		System.out.println("check firefox version");
		System.out.println("check OS version");
	}
	
	public static void main(String[] args) {

		WebDriver obj = new WebDriver();
		obj.launchBrowser("chrome");
		
		
		
	}

}
