package office_hours_1.language_factory;

public class LanguageFactory {
	
	/*
	
	Create a class and name it ParkingLot 
	create static int parkingSpace variable and assign 120 to it.
	create a method (parkVehicle) that tracks the number of vehicles that parked in parking lot. When you create this method make sure that if parking space is 0 then give the message to the user that there is NOT space in the parking lot.

	create another method (showParkingSpaces) that shows how many spaces left in the parking lot.

	Create another class and name it ParkingLotBuilding
	create main method
	call showParkingSpaces method and see how many spaces left


	call parkVehicle method 
	call showParkingSpaces method and see how many spaces left

	call parkVehicle method and park 100 vehicles
	call showParkingSpaces method and see how many spaces left


	call parkVehicle method and park 20 vehicles
	call showParkingSpaces method and see how many spaces left
	
	*/
	
	public static void main(String[] args) {
		String language = "java";
		
		switch(language.toLowerCase()) {
		case Constants.JAVA:
			System.out.println("I will code in Java");
			break;
		case Constants.PYTHON:
			System.out.println("I will code in Python");
			break;
		case Constants.JAVA_SCRIPT:
			System.out.println("I will code in Java Script");
			break;
		case Constants.RUBY:
			System.out.println("I will code in Ruby");
			break;
		default:
			System.out.println("ERROR: I don't know that language: " + language);
		}
	}

}
