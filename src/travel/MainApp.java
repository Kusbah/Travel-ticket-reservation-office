package travel;

public class MainApp {

	public static void main(String[] args) {
		
		
		Passenger p1 = new Passenger(0, "Abdullah", "4848484");
		Passenger p2 = new Passenger(1, "mohmad", "7878787");
		p1.print_info();
		
		Bus bus1 = new Bus();
		bus1.AddVehicle(0, "BMW", "M4");
		bus1.print_info();
	}

}
