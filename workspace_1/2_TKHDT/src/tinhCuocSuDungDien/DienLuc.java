package tinhCuocSuDungDien;

import java.util.HashMap;
import java.util.Map;

public class DienLuc {
	private String name;

	// danh sach tat ca khach hang cua Chi Nhanh.
	private Map<String, NguoiDung> nguoiDung;

	public DienLuc(String name) {
		this.name = name;
		nguoiDung = new HashMap<String, NguoiDung>();
	}

	public void register(NguoiDung customer) {
		nguoiDung.put(customer.getID(), customer);
	}

	public NguoiDung getNguoiDung(String id) {
		return nguoiDung.get(id);
	}

	// Xuat hoa don cho khach hang co ma id.
	public void inMotKH(String id) {
		System.out.println(" ****Chi nhanh Dien Luc " + name + "****\n");
		System.out.println(" HOA DON TIEN DIEN CUA KHACH HANG");
		System.out.println("==================================\n");
		getNguoiDung(id).inHoaDon();
		System.out.println("==================================");
	}

	// Xuat hoa don cho tat ca khach hang.
	public void inTatCaKH() {
		System.out.printf("Chi nhanh Dien Luc %s\n", name);
		System.out.println("BAO CAO VE VIEC THU TIEN DIEN CUA KHACH HANG");
		for (NguoiDung customer : nguoiDung.values()) {
			System.out.println("*********************************");
			customer.inHoaDon();
		}
		System.out.println("=================================");
	}

	public void inIDTen() {
		System.out.printf("Chi nhanh Dien Luc %s\n", name);
		System.out.println("Thong tin khach hang");
		System.out.println("===================================\n");
		for (NguoiDung nguoiDung : nguoiDung.values()) {
			System.out.println("- - - - - - - - - - - - - - - - - -");
			System.out.printf("* ID: %s \nTen: %s\n", nguoiDung.getID(), nguoiDung.getTen());
		}
		System.out.println("===================================");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
