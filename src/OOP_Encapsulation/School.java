package OOP_Encapsulation;

public class School {

	public String name;
	public String address;
	public int teachersCount;
	public int studentsCount;
	private int salary;
	
	public String getCEOName() {
		return "Asghar";
	}
	
	private int totalNetProfit() {
		return 50000;
	}
	
	
	public static void main(String[] args) {
		School s = new School();
		
		s.name = "Orchlon";
		s.address = "Embassy Street";
		s.teachersCount = 200;
		s.studentsCount = 2000;
		s.salary = 4000;
		s.getCEOName();
		s.totalNetProfit();
		
		System.out.println(s.name);
		System.out.println(s.address);
		System.out.println(s.teachersCount);
		System.out.println(s.studentsCount);
		System.out.println(s.salary);
		System.out.println(s.getCEOName());
		System.out.println(s.totalNetProfit());
		
		
		
		
		
	}
	
	
}
