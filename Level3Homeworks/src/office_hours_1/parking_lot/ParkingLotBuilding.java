package office_hours_1.parking_lot;

public class ParkingLotBuilding {
	
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
		ParkingLot.showParkingSpaces();
		
		ParkingLot.parkVehicle();
		ParkingLot.showParkingSpaces();
		
		ParkingLot.parkVehicle(100);
		ParkingLot.showParkingSpaces();
		
		ParkingLot.parkVehicle(20);
		ParkingLot.showParkingSpaces();
	}

}
