package travel;

public class Passenger {
	private int id;
	private String name,phone;

	public Passenger(int id ,String name,String phone) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void getPassengerInfo() {
		System.out.println("ID: "+id +"\nName: "+name+"\nPhone: "+phone);
	}
}
