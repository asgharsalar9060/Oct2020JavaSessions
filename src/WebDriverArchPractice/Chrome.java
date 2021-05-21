package WebDriverArchPractice;

public class Chrome implements WebDriver{
	
	public Chrome() {
		System.out.println("launch Google Chrome driverr");
	}

	@Override
	public void get(String url) {
		System.out.println("launching url "+ url);
	}

	@Override
	public void getTitle() {
		System.out.println("title is: " + "facebook");
		
	}

	@Override
	public void getPageUrl() {
		System.out.println("http://www.facebook.com");
	}

	@Override
	public void getElement(String locator) {
		System.out.println("finding locator "+locator);
	}

	@Override
	public void quit() {
		System.out.println("quiting browser");
	}

}
