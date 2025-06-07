package travel;

public class Bus extends Vehicle implements Ticket{

	@Override
	public boolean createTicket(Passenger passenger, Trip trip) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void getInfo() {
		System.out.println("the Bus datails : id : "+id +"\nthe Modle: "+modle+"\ncompany Name: "+company);
	}

}
