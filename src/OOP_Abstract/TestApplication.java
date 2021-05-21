package OOP_Abstract;

public class TestApplication {

	public static void main(String[] args) {
		
		//what's the difference between the interface and abstract class?
		//abstract classes can be changed from 100% to partial abstraction or 0%
		//but interface cannot be changed

		WhatsApp wp = new WhatsApp();
		
		wp.dbSetup();
		wp.envSetup();
		wp.serverSetup();
		wp.UILayerComponents();
		
		
		
	}

}
