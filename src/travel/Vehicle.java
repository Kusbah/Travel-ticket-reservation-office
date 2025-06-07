package travel;


abstract public class Vehicle {

	 String company;
	 String modle;
	 int id;
	void AddVehicle(int id,String company,String modle) {
		this.id = id;
		this.company = company;
		this.modle = modle;
	}
	
	abstract public void getInfo();
}