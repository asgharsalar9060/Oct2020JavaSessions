package OOP_Encapsulation;

public class GymMembers {
	
	public String name;
	public int age;
	private int lockerCode;
	public static boolean regular;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLockerCode() {
		return lockerCode;
	}

	public void setLockerCode(int lockerCode) {
		this.lockerCode = lockerCode;
	}

	public boolean isRegular() {
		return regular;
	}

	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	
	

}
