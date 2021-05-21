package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {

		EcommApp shop = new EcommApp();
		
		shop
		.login("salar@gmail.com", "salar123")
		.doSearch("MiPi", 12000)
		.addToCart("MiPi")
		.doPayment("SiSi", "salar123")
		.logout()
		.login()
		.doSearch("Nini")
		.addToCart("Nini")
		.doPayment("Bank of America", "salar123")
		.logout();
		
		int orderId = shop.generateOrderId();
		System.out.println(orderId);
		
		shop.doPayment("DC bank", "salar123").logout();
		
		shop.login().doSearch("iBook").doPayment("Bank of America", "salar123").logout();
		
		shop.login().logout();
	}

}
