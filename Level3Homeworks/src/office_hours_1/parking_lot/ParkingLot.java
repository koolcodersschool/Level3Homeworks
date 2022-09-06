package office_hours_1.parking_lot;

public class ParkingLot {
	
	public static int parkingSpace = 120;
	
	public static void parkVehicle() {
		if(parkingSpace > 0) {
			parkingSpace--;
			System.out.println("Your vehicle parked succefully");
		}else {
			System.out.println("ERROR: There is NOT enough space in the parking lot. Space count is: " + parkingSpace);
		}
	}
	
	public static void parkVehicle(int vehicleCount) {
		if((parkingSpace - vehicleCount) > 0) {
			parkingSpace = parkingSpace - vehicleCount;
			System.out.println(vehicleCount + " vehicle parked succefully");
		}else {
			System.out.println("ERROR: There is NOT enough space in the parking lot. Space count is: " + parkingSpace);
			System.out.println("You can park only " + parkingSpace + " vehicles");
		}
	}
	
	public static void showParkingSpaces() {
		System.out.println("There are " + parkingSpace + " spaces in the parking lot");
	}

}
