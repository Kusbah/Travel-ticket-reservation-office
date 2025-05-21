package travel;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainApp {

	public static void main(String[] args) {
		
		Plane plane = new Plane();
		plane.AddVehicle(0, "AirBus", "ZT100");
		Trip jordenPalstineTrip = new Trip();
		LocalTime tripDTime = LocalTime.now();
		LocalDate tripDate = LocalDate.now();
		
		Passenger basemPassenger = new Passenger(2151561, "Basem", "78984516");
		
		Trip trip =new Trip();
		trip.createTrip(0, "Jorder", "Palstine", tripDate, tripDTime, plane);
		
	}

}
