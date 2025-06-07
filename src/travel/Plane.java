package travel;

import java.util.ArrayList;
import java.util.HashMap;

public class Plane extends Vehicle implements Ticket{
	HashMap<Trip, ArrayList<Passenger>> tripPassengerHashMap =new HashMap<Trip,ArrayList<Passenger>>();
	
	ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	@Override
	public boolean createTicket(Passenger passenger, Trip trip) {

		passengers.add(passenger);
		tripPassengerHashMap.put(trip, passengers);
		return false;
	}

	void getTripPassengers(Trip t) {
		ArrayList<Passenger> tripPassengers = tripPassengerHashMap.get(t);
		
		for (Passenger passenger : 
			tripPassengers) {
			System.out.println(passenger.getName());
		}
	}
	public void getInfo() {
		System.out.println("the Plane datails : id : "+id +"\nthe Modle: "+modle+"\ncompany Name: "+company);
	}
}
