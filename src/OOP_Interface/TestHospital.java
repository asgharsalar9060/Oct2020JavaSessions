package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.emergencyServices();
		fh.cardioServices();
		fh.neuroServices();
		
		fh.insuranceServices();
		
		System.out.println(fh.min_fee);
		
		fh.totalDocters(100);
		USMedical.hospitalAdmin();
		fh.billing();
		
		fh.medicalTraining();
		
		fh.covidTest();
		
		fh.medicalTraining();
		
		//Top casting:
		USMedical us = new FortisHospital();//child class object can be referred by parent interface variable
		
		us.cardioServices();
		us.emergencyServices();
		us.cardioServices();
		us.orthoServices();
		//we can't access any method of UKMedical or IndianMedical because Java does a reference type check while calling...
		
		//Down casting: can't do down casting
		
		//FortisHospital fs = new USMedical();
		
	}

}
