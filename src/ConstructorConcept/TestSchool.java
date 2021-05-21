package ConstructorConcept;

import java.util.ArrayList;

public class TestSchool {

	public static void main(String[] args) {

		ArrayList<String> specialProgramsList = new ArrayList<String>();
		
		specialProgramsList.add("Special English");
		specialProgramsList.add("Special Maths");
		specialProgramsList.add("Special Physics");
		specialProgramsList.add("Special Chimestry");
		specialProgramsList.add("Special Biology");
		
		School s = new School("Khan Academy", "Mountainview, California", 20, 200, false, specialProgramsList);
		
		System.out.println(s.name + " " + s.address + " " + s.teachersCount + " " + s.studentsCount);
		System.out.println( s.isPublic + " " + s.specialPrograms);
	}

}
