package WebDriverArchPractice;

public class FacebookAppTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			driver = new Chrome();
		}
		else if(browser.equals("firefox")) {
			driver = new Firefox();
		}
		else {
			System.out.println("please pass the correct browser");
		}
		
		driver.get("http://www.facebook.com");
		driver.getTitle();
		driver.getPageUrl();
		driver.getElement("username");
		driver.quit();
		
		
		
		
		
	}

}
