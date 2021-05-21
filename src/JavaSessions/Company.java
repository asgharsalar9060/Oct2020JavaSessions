package JavaSessions;

import java.util.ArrayList;

public class Company {

	String name;
	int empCount;
	
	public String getSEOName() {
		return "Tom";
	}
	
	public int getTotalCount() {
		System.out.println("get total count of the shares");
		int totalShares = 2000;
		
		return totalShares;
	}
	
	public String[] getCoFounders() {
		System.out.println("get cofounders");
		String founder[] = new String [3];
		founder[0] = "Asghar";
		founder[1] = "Anwar";
		founder[2] = "Abuzer";
		
		return founder;
	}
	
	public ArrayList<String> getCustomerList() {
		System.out.println("customer list");
		
		ArrayList<String> custList = new ArrayList<String>();
		
		custList.add("Dew");
		custList.add("Pepsi");
		custList.add("Coke");
		
		return custList;
		
	}
	
	public static void main(String[] args) {

		Company comp = new Company();
		
		String str1 = comp.getSEOName();
		System.out.println(str1);
		
		System.out.println(comp.getSEOName());
		
		int shares = comp.getTotalCount();	
		System.out.println(shares);
		
		String founderArr[] = comp.getCoFounders();
		System.out.println(founderArr.length);
		
		for(int founder2=0; founder2<founderArr.length; founder2++) {
			System.out.println(founderArr[founder2]);
		}
		
		for(String e : founderArr) {
			System.out.println(e);
		}
		
		ArrayList<String> custArray = comp.getCustomerList();
		
		System.out.println(custArray.size());
		
		for(String e1 : custArray) {
			System.out.println(e1);
		}
		
		
	}

}
