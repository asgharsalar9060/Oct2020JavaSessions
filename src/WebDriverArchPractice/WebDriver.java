package WebDriverArchPractice;

public interface WebDriver {
	
	public void get(String url);
	public void getTitle();
	public void getPageUrl();
	public void getElement(String locator);
	public void quit();
}
