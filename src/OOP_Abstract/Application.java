package OOP_Abstract;

public abstract class Application {

	// all the methods are abstract in nature
	// no non-abstract methods
	// 100% abstraction

	// what are the advantages of the abstraction?
	// we can achieve the abstraction at 0%, partial abstraction or 100%
	// abstraction...
	// we can create a class with abstraction or non abstraction

	public abstract void serverSetup();

	public abstract void dbSetup();

	public abstract void envSetup();

	public void UILayerComponents() {
		System.out.println("Application -- UILayerComponents");
	}

}
