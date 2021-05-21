package WebDriverArch;

public class SafariDriver implements WebDriver{
	
	public SafariDriver() {
		System.out.println("launch Safari browser");
	}

	@Override
	public void get(String url) {
		System.out.println("launching url "+ url);
	}

	@Override
	public void getTitle() {
		System.out.println("url is: "+ "google");
		
	}

	@Override
	public void getPageUrl() {
		System.out.println("finding the element: "+ "www.google.com");
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the element: "+ locator);		
	}

	@Override
	public void quit() {
		System.out.println("quit browser");		
	}

}
