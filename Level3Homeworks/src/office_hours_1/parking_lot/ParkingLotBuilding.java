package office_hours_1.parking_lot;

public class ParkingLotBuilding {
	
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
