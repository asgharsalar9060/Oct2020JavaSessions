package OOP_Encapsulation;

public class UsersTest {

	public static void main(String[] args) {
		
		//1. directly access 
		Users user1 = new Users();
		user1.name = "Asghar";
		System.out.println(user1.name);
		
		//2. using the const...
		Users user2 = new Users("Asghar", 27, 101);
		System.out.println(user2.name + " " + user2.age + " " + user2.id);
		
		//3. setter and getter
		Users user3 = new Users();
		user3.setName("Anwar");
		user3.setAge(29);
		user3.setId(102);
		
		System.out.println(user3.getName() + " " + user3.getAge() + " " + user3.getId());
		System.out.println(user3.name + " " + user3.age + " "+ user3.id + Users.comName);
	}

}
