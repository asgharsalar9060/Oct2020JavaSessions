package ConstructorConcept;

import java.util.ArrayList;

public class School {
	
	String name;
	String address;
	int teachersCount;
	int studentsCount;
	boolean isPublic;
	ArrayList<String> specialPrograms;
	
	public School(String name, String address, int teachersCount, int studentsCount, boolean isPublic,
			ArrayList<String> specialPrograms) {

		this.name = name;
		this.address = address;
		this.teachersCount = teachersCount;
		this.studentsCount = studentsCount;
		this.isPublic = isPublic;
		this.specialPrograms = specialPrograms;
	}
	
	
	
	
	

}
