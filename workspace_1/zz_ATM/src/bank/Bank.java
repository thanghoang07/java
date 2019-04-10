package bank;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;

public class Bank {
	private List<Customer> listCustomer;
	private String nameBank, addressBank;

	public Bank(String nameBank, String addressBank) {
		this.listCustomer = new ArrayList<>();
		this.nameBank = nameBank;
		this.addressBank = addressBank;
	}

}
