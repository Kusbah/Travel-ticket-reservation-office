package travel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Vector;

public class Trip {

	public int tripId;
	private String from;
	private String to;
	private LocalDate tripDate;
	private LocalTime tripTime;
	private Vehicle v;
	
	void createTrip(int tripId,String from, String to, LocalDate tripDate,LocalTime tripTime,Vehicle v) {
		this.tripId=tripId;
		this.from = from;
		this.to = to;
		this.tripDate = tripDate;
		this.tripTime = tripTime;
		this.v = v;
	}
	void getTripDetails() {
		System.out.println("the Trip Info is : \n"+"trip number is: "+tripId+" trip from: "+from+" trip to: "+to );
		System.out.println("the trip date is: "+tripDate+" and time is: "+tripTime);
		if(v instanceof Plane) {
			((Plane) v).getTripPassengers(this);
		}
		v.getInfo();
	}
}
