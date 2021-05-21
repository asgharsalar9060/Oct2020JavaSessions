package WebDriverArch;

public interface WebDriver {

	public void get(String url);
	public void getTitle();
	public void getPageUrl();
	public void findElement(String locator);
	public void quit();
	
	
}
