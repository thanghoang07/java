package customer;

import java.util.HashMap;
import java.util.Map;

import bank.Money;

public class Customer {
	private String idCustomer;
	private String nameCustomer;
	private String address;
	private long balane;
	private Map<Integer, HashMap<Integer, Money>> informationCard;

	public Customer(String idCustomer, String nameCustomer, String address, long balane,
			Map<Integer, HashMap<Integer, Money>> informationCard) {
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.address = address;
		this.balane = balane;
		this.informationCard = informationCard;
	}

}
