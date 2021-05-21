package OOP_Encapsulation;

public class WebDriverTool {

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
		System.out.println("checking chrome version");
		System.out.println("checking OS version");
		System.out.println("launch chrome");
	}
	
	private void launchFirefox() {
		System.out.println("checking firefox version");
		System.out.println("checking OS version");
		System.out.println("launch firefox");
	}
	
	
	
}
