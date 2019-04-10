package lab01;

public class House {
	private String kind;
	private int numberOfRoom;
	private double price;
	private Address address;
	
	public House(String kind, int numberOfRoom,
			double price, Address address) {
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.price = price;
		this.address= address;
		
	}

}
