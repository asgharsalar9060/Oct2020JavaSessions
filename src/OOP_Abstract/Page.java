package OOP_Abstract;

public abstract class Page {
	
	//we can not create the object of abstract class
	//page class constructor will be called when we create the object of child class
	
	//constructor will be called at the time of object creation - we can call it after we created the object
	//here we created the constructor because we already created the object of child class in TestPage
	
	//some abstract methods and some non abstract methods: partial abstraction
	
	public Page() {
		System.out.println("page -- constructor");
	}

	public abstract void title();
	public abstract void url();
	public abstract void loading();
	
	public void header() {
		System.out.println("page -- header");
	}
	
	public static final void logo() {
		System.out.println("page -- logo");
	}

}
