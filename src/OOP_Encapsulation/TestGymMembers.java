package OOP_Encapsulation;

public class TestGymMembers {

	public static void main(String[] args) {

		GymMembers gm = new GymMembers();
		gm.setName("Arnold");
		gm.setAge(34);
		gm.setLockerCode(8673);
		
		System.out.println(gm.getName() + " " + gm.getAge() + " " + gm.getLockerCode() + " " + GymMembers.regular);
		
	}

}
