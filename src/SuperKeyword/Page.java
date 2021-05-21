package SuperKeyword;

public class Page {
	
	public Page() {
		System.out.println("Page const...");
	}
	
	public Page(int time) {
		System.out.println("Page const... with time: "+time);
	}
	
	int loadTime = 30;
	
	public void pageTitle() {
		System.out.println("page title");
	}

}
