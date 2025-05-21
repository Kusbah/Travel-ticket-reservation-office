package travel;

import java.util.ArrayList;

public class Schedule {

	private ArrayList<Trip>tripSchdule = new ArrayList<>();

	public ArrayList<Trip> tripSchdule() {
		return tripSchdule;
	}

	public void tripSchdule(Trip trip) {
		tripSchdule.add(trip);
	}
	
	public Trip getSingleTripInfo(int tripId) {
		Trip t = new Trip();
		for (Trip rowTrip :
			tripSchdule) {
			if(rowTrip.tripId == tripId)
				t=rowTrip;
			break;
		}
		return t;
	}
	
}
