package JavaSessions;

public class User {

	String username;
	int age;
	String city;
	
	public static void main(String[] args) {

		User usr1 = new User();
		usr1.username = "Asghar";
		usr1.age = 27;
		usr1.city = "UB";
		
		User usr2 = new User();
		usr2.username = "Anwar";
		usr2.age = 29;
		usr2.city = "DC";
		
		User usr3 = new User();
		usr3.username = "Abuzer";
		usr3.age = 16;
		usr3.city = "Kabul";
		
		System.out.println(usr1.username + " " + usr1.age + " " + usr1.city);
		System.out.println(usr2.username + " " + usr2.age + " " + usr2.city);
		System.out.println(usr3.username + " " + usr3.age + " " + usr3.city);
		
		System.out.println("**********************");
		
		usr1 = usr2;
		
		System.out.println(usr1.username + " " + usr1.age + " " + usr1.city);
		System.out.println(usr2.username + " " + usr2.age + " " + usr2.city);
		System.out.println(usr3.username + " " + usr3.age + " " + usr3.city);
		
		System.out.println("**********************");
		
		usr2 = usr3;
		
		System.out.println(usr1.username + " " + usr1.age + " " + usr1.city);
		System.out.println(usr2.username + " " + usr2.age + " " + usr2.city);
		System.out.println(usr3.username + " " + usr3.age + " " + usr3.city);
		
		System.out.println("**********************");
		
		usr3 = usr1;
		
		System.out.println(usr1.username + " " + usr1.age + " " + usr1.city);
		System.out.println(usr2.username + " " + usr2.age + " " + usr2.city);
		System.out.println(usr3.username + " " + usr3.age + " " + usr3.city);
	}

}
