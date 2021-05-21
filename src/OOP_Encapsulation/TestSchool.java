package OOP_Encapsulation;

public class TestSchool {

	public static void main(String[] args) {

		School s = new School();
		s.name = "Orkhon";
		s.address = "Ub";
		s.teachersCount = 200;
		s.studentsCount = 2000;
		s.getCEOName();
		
		System.out.println(s.name + " " + s.address);
		
		
		
		
	}

}
