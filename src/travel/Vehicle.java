package travel;


abstract public class Vehicle {

	private String company;
	private String modle;
	private int id;
	void AddVehicle(int id,String company,String modle) {
		this.id = id;
		this.company = company;
		this.modle = modle;
	}
	
	public void print_info() {
		System.out.println("company : "+company +"\nModle: "+modle);
	}
}