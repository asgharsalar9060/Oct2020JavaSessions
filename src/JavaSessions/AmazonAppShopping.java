package JavaSessions;

public class AmazonAppShopping {

	public static void main(String[] args) {

		//method chaining or builder pattern: we can create different flows
		
		AmazonApp shop = new AmazonApp();
		shop.login(97987343, 976)
			.search("Mac Pro")
			.addToCart("Mac Pro")
			.payment("1234 1234 1232 1243")
			.logout();
		
		shop.login("salar@gmail.com", "salar123")
			.addToCart("MacAir")
			.payment("1235 3435 5353 34343")
			.logout();
			
		
	}

}
