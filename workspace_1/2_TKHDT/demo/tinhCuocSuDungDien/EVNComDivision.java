package tinhCuocSuDungDien;

import java.util.*;

/*
 * mot chi nhanh cua cong ty dien luc
 */
public class EVNComDivision {
	private String name;

	// danh sach tat ca khach hang cua Chi Nhanh.
	private Map<String, Customer> customers = new HashMap<String, Customer>();

	public EVNComDivision(String name) {
		this.name = name;
	}

	public void register(Customer customer) {
		customers.put(customer.getId(), customer);
	}

	public Customer getCustomer(String id) {
		return customers.get(id);
	}

	// Xuat hoa don cho khach hang co ma id.
	public String invoice(String id) {
		StringBuffer result = new StringBuffer("Cong ty " + name + "\n");
		result.append("HOA DON TIEN DIEN CUA KHACH HANG\n\n");
		result.append(getCustomer(id).statement());
		return result.toString();
	}

	// Xuat hoa don cho tat ca khach hang.
	public String allInvoice() {
		StringBuffer result = new StringBuffer("Cong ty " + name + "\n");
		result.append("BAO CAO VE VIEC THU TIEN DIEN CUA KHACH HANG\n\n");
		for (Customer customer : customers.values()) {
			result.append(customer.statement());
		}
		return result.toString();
	}
}
