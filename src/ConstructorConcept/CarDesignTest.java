package ConstructorConcept;

import java.util.ArrayList;

public class CarDesignTest {

	public static void main(String[] args) {

		CarDesign car_BMW = new CarDesign("BMW", "Blue");
		
		System.out.println(car_BMW.name + " " + car_BMW.color);
		
		CarDesign car_Toyota = new CarDesign("Toyota", "Red", 6000, 'Y');
		System.out.println(car_Toyota.name + " " + car_Toyota.isAvailable);
		
		ArrayList<String> hondaFeaturesList = new ArrayList<String>();
		
		hondaFeaturesList.add("Automatic parking");
		hondaFeaturesList.add("Rear camera");
		hondaFeaturesList.add("Sun roop");
		hondaFeaturesList.add("Turbo Q engine");
		hondaFeaturesList.add("lane assist");
		
		CarDesign car_Honda = new CarDesign("Honda", "Black", 4000, 12.23, false, 'Y', hondaFeaturesList);
		
		System.out.println(car_Honda.name + " " + car_Honda.color + " " + car_Honda.price);
		
		System.out.println(car_Honda.featuresList);
	}

}
